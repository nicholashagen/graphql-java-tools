package com.coxautodev.graphql.tools.example.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.coxautodev.graphql.tools.example.CharacterRepository;
import com.coxautodev.graphql.tools.example.types.Character;
import com.coxautodev.graphql.tools.example.types.Droid;
import com.coxautodev.graphql.tools.example.types.Episode;
import com.coxautodev.graphql.tools.example.types.Human;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class HumanResolver implements GraphQLResolver<Human> {

	public List<Character> getBestFriends(Human human, DataFetchingEnvironment env) {
        return human.getFriends();
    }
}
