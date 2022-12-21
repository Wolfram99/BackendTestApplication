package com.example.BackendTestApplication.Bicycle;

import com.example.BackendTestApplication.Models.ConsumerProducts;
import com.example.BackendTestApplication.Models.DiscountCard;
import com.example.BackendTestApplication.Models.Check;
import com.example.BackendTestApplication.PatternBuilder.CheckBuilder;
import com.example.BackendTestApplication.PatternBuilder.Director;
import com.example.BackendTestApplication.PatternDecorator.CheckFooter;
import com.example.BackendTestApplication.PatternDecorator.CheckHeader;
import com.example.BackendTestApplication.PatternDecorator.CheckRender;
import com.example.BackendTestApplication.PatternDecorator.RenderingOfPurchasedProducts;

import java.util.ArrayList;
import java.util.List;

public class BuildCheckDs extends BuildCheck{


    @Override
    public String buildCheckFile(String[] args) {


            String cardNumber = null;
            List<String[]> splitArg = new ArrayList<String[]>();

            for (String a : args) {
                if (!a.contains("card")) {
                    splitArg.add(a.split("-"));
                } else {
                    cardNumber = a.split("-")[1];
                }
            }

            Director director = new Director();
            CheckBuilder builder = new CheckBuilder();
            director.createCheck(builder,ReaderFile.callProduct(splitArg), ReaderFile.callCrad(cardNumber));
            Check check = builder.build();
            CheckRender checkRender = new CheckFooter(new CheckHeader(new RenderingOfPurchasedProducts()));

            return checkRender.chekRenderMethod(check);

    }
    @Override
    public String buildCheckDS(String[] args, List<ConsumerProducts> lp, List<DiscountCard> lc) {


        String cardNumber = null;
        List<String[]> splitArg = new ArrayList<String[]>();

        for (String a : args) {
            if (!a.contains("card")) {
                splitArg.add(a.split("-"));
            } else {
                cardNumber = a.split("-")[1];
            }
        }

        Director director = new Director();
        CheckBuilder builder = new CheckBuilder();
        director.createCheck(builder,ReaderFile.callProduct(splitArg), ReaderFile.callCrad(cardNumber));
        Check check = builder.build();
        CheckRender checkRender = new CheckFooter(new CheckHeader(new RenderingOfPurchasedProducts()));

        return checkRender.chekRenderMethod(check);

    }
}
