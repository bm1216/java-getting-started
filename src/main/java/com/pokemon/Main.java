/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pokemon;

import com.pokemon.repo.GlobalCardRepository;
import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.model.PokemonStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
@EntityScan("com.pokemon.entity")
@SpringBootApplication
public class Main {

  /*@Value("${spring.datasource.url}")
  private String dbUrl;*/

/*  @Autowired
  private DataSource dataSource;*/

  @Autowired
  private GlobalCardRepository globalCardRepository;

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Main.class, args);
  }

  @GetMapping("/add")
  public void addToDB() {
    /*PokeApi pokeApi = new PokeApiClient();
    //for(int i=1; i<=251; i++) {
      Pokemon pokemon=pokeApi.getPokemon(1);
      List<PokemonStat> temp=pokemon.getStats();
      //for (int i=0; i<pokemon.getStats().size(); i++) {
        System.out.println(temp.get(0));*/
    System.out.println("You are connected to DB bruh");
      }
   // }
 // }

  @RequestMapping("/")
  String index() {
    return "index";
  }

  /*@RequestMapping("/db")
  String db(Map<String, Object> model) {
    try (Connection connection = dataSource.getConnection()) {
      Statement stmt = connection.createStatement();
      stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
      stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
      ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

      ArrayList<String> output = new ArrayList<String>();
      while (rs.next()) {
        output.add("read from DB: " + rs.getTimestamp("tick"));
      }

      model.put("records", output);
      return "db";
    } catch (Exception e) {
      model.put("message", e.getMessage());
      return "error";
    }
  }*/
  /*@Bean
  public DataSource datasource() {
    return DataSourceBuilder.create()
            .driverClassName("org.postgresql.Driver")
            .url("jdbc:jdbc:postgresql://ec2-34-195-169-25.compute-1.amazonaws.com/dd4evmm97k7vti")
            .username("ytjtwsowsfviuf")
            .password("9b1f76534482bfb8f68f4520a3ab0829dec7fb29a19d11085b816e58855b3ddf")
            .build();
  }*/
}

