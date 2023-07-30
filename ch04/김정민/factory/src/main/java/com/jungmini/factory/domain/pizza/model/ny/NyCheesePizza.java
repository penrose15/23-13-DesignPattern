package com.jungmini.factory.domain.pizza.model.ny;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class NyCheesePizza implements NyPizza {

    private final String name;
    private final Set<String> toppings;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public NyCheesePizza() {
        this.name = "NyCheesePizza";
        this.toppings = Set.of("치즈", "막걸리");
    }

    @Override
    public void prepare() {
        logger.info("NyCheesePizza 준비중");
        logger.info("NyCheesePizza Toppings: {}", toppings);
    }

    @Override
    public void bake() {
        logger.info("NyCheesePizza 굽는중");
    }

    @Override
    public void cut() {
        logger.info("NyCheesePizza 자르는중");
    }

    @Override
    public void box() {
        logger.info("NyCheesePizza 담는중");
    }

    @Override
    public String getName() {
        return name;
    }
}
