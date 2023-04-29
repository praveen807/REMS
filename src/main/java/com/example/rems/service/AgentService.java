package com.example.rems.service;

import com.example.rems.domain.AgentDetails;
import com.example.rems.domain.PropertyDetails;
import com.example.rems.entity.Agent;
import com.example.rems.entity.Appartment;
import com.example.rems.entity.House;
import com.example.rems.entity.Property;
import com.example.rems.repository.AgentRepo;
import com.example.rems.repository.AppartmentRepo;
import com.example.rems.repository.HouseRepo;
import com.example.rems.repository.PropertyRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AgentService {

    @Resource
    private AgentRepo agentRepo;

    @Resource
    private PropertyRepo propertyRepo;

    @Resource
    private HouseRepo houseRepo;

    @Resource
    private AppartmentRepo appartmentRepo;

    public String addAgent(AgentDetails agentDetails) {

        Agent agent = Agent.builder().agid(agentDetails.getAgid()).job_title(agentDetails.getJob_title()).name(agentDetails.getName())
                .phone(agentDetails.getPhone()).agency_name(agentDetails.getAgency_name()).build();
        agentRepo.save(agent);
        return "Succes";
    }

    public String addProperty(PropertyDetails propertyDetails){

        Property property = Property.builder().pType(propertyDetails.getProperty_type())
                .availability(propertyDetails.getAvailablity())
                .city(propertyDetails.getCity())
                .description(propertyDetails.getDescription())
                .price(propertyDetails.getPrice())
                .saleType(propertyDetails.getSaleType())
                .zipCode(propertyDetails.getZipcode())
                .state(propertyDetails.getState()).build();

        if (propertyDetails.getProperty_type().equals("house")){
            House house = House.builder().location(propertyDetails.getLocation())
                    .number_of_rooms(propertyDetails.getNumber_of_rooms())
                    .sq_foot(propertyDetails.getSq_foot()).property(property).build();
            houseRepo.save(house);
        }
        else if (propertyDetails.getProperty_type().equals("appartment")) {
            Appartment appartment = Appartment.builder().building_type(propertyDetails.getBuilding_type())
                    .location(propertyDetails.getLocation())
                    .number_of_rooms(propertyDetails.getNumber_of_rooms())
                    .sq_foot(propertyDetails.getSq_foot()).property(property).build();
            appartmentRepo.save(appartment);
        }
        else {
            return "Enter Correct property type";
        }

        return "Success";
    }
}
