package com.example.taskmangerapp.config;

import com.example.taskmangerapp.resolver.MutationResolver;
import com.example.taskmangerapp.resolver.QueryResolver;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQlConfig {

    @Bean
    public GraphQLSchema graphQLSchema() {
        return SchemaParser.newParser()
                .file("classpath:schema.graphqls") // Emplacement de fichier de schéma GraphQL
                .resolvers(queryResolver(), mutationResolver()) // Définir les resolvers
                .build()
                .makeExecutableSchema();
    }

    @Bean
    public QueryResolver queryResolver() {
        return new QueryResolver();
    }

    @Bean
    public MutationResolver mutationResolver() {
        return new MutationResolver();
    }
}


