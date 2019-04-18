package com.herlambang.unicornlist.data;

import com.herlambang.unicornlist.model.Startup;

import java.util.ArrayList;

public class StartupData {

    public static String[][] collection = new String[][]{
            {
                    "Airbnb", //name
                    "https://cdn-images-1.medium.com/max/1600/1*obu4DTlPZZF2jOQnqDQf6Q.png", //image
                    "Brian Chesky", //founder
                    "https://pbs.twimg.com/profile_images/680250513951084544/yFwa_Sjd_400x400.jpg", //founderimage
                    "eCommerce/Marketplace", //type
                    "Airbnb is a community marketplace for people to list, discover, and book accommodations around the world online or from a mobile phone. Whether an apartment for a night, a castle for a week, or a villa for a month, Airbnb connects people to travel experiences, at any price point. \n" +
                    "\n", //overview
                    "29.3 Billion USD", //valuation
                    "https://images-na.ssl-images-amazon.com/images/I/61aCk709t8L._SY500_.jpg", //Logo
                    "General Catalyst Partners, Andreessen Horowitz, ENIAC Ventures" //investors
            },
            {
                    "GrabTaxi", //name
                    "https://4.bp.blogspot.com/-Ge0J2_F1FEw/W_g-uNzFN_I/AAAAAAAABmo/txTtV4yFMlc1J1DVt3EI8a8ZqpcLO0WZwCLcBGAs/s1600/Screen%2BShot%2B2018-11-24%2Bat%2B1.53.27%2BAM.png", //image
                    "Anthony Tan", //founder
                    "http://globaltransformation.com/wp-content/uploads/2017/03/anthony-tan-390x390.jpg", //founderimage
                    "On-Demand", //type
                    "Grab is an on-demand transportation and mobile payments platform, offering private car, motorbike, taxi, and carpooling services in Southeast Asia. The platform features GrabPay Credits, a cashless top-up payments option; the 'Share your Ride' function, which allows users to share their journey through social media or messaging apps with friends and family, providing extra security for passengers; and the ability to rate drivers and view their information. \n", //overview
                    "14 Billion USD", //valuation
                    "https://seeklogo.com/images/G/grab-logo-7020E74857-seeklogo.com.png", //Logo
                    "GGV Capital, Vertex Venture Holdings, Softbank Group" //investors
            },
            {
                    "Pinterest", //name
                    "https://s3.r29static.com//bin/entry/800/720x479,85/1203323/image.webp", //image
                    "Paul Sciarra", //founder
                    "https://specials-images.forbesimg.com/imageserve/564b4ea5e4b0ffa7afe738a6/280x425.jpg?fit=scale&background=000000", //founderimage
                    "Social", //type
                    "Pinterest, formerly Cold Brew Labs, is a place to discover ideas for projects and interests, hand-picked by people. Users can discover and save creative ideas for cooking, travel, home improvement and more. \n" +
                            "\n", //overview
                    "10.47 Billion USD", //valuation
                    "https://www.shareicon.net/data/2015/08/29/92548_logo_512x512.png", //Logo
                    "Andreessen Horowitz, Bessemer Venture Partners, Firstmark Capital\n" //investors
            }
//            {
//                    "", //name
//                    "", //image
//                    "", //founder
//                    "", //founderimage
//                    "", //type
//                    "", //overview
//                    "", //valuation
//                    "", //Logo
//                    "" //investors
//            },
    };

    public static ArrayList<Startup> getListData(){
        Startup startup = null;
        ArrayList<Startup> list = new ArrayList<>();

        for (String[] data : collection) {
            startup = new Startup();
            startup.setName(data[0]);
            startup.setImage(data[1]);
            startup.setFounder(data[2]);
            startup.setFounderimage(data[3]);
            startup.setType(data[4]);
            startup.setOverview(data[5]);
            startup.setValuation(data[6]);
            startup.setLogo(data[7]);
            startup.setInvestors(data[8]);

            list.add(startup);
        }

        return list;
    }

}
