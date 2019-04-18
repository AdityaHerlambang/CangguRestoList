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
                    "Airbnb is a community marketplace for people to list, discover, and book accommodations around the world online or from a mobile phone. Whether an apartment for a night, a castle for a week, or a villa for a month, Airbnb connects people to travel experiences, at any price point.", //overview
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
                    "Grab is an on-demand transportation and mobile payments platform, offering private car, motorbike, taxi, and carpooling services in Southeast Asia. The platform features GrabPay Credits, a cashless top-up payments option; the 'Share your Ride' function, which allows users to share their journey through social media or messaging apps with friends and family, providing extra security for passengers; and the ability to rate drivers and view their information.", //overview
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
                    "Pinterest, formerly Cold Brew Labs, is a place to discover ideas for projects and interests, hand-picked by people. Users can discover and save creative ideas for cooking, travel, home improvement and more.", //overview
                    "10.47 Billion USD", //valuation
                    "https://www.shareicon.net/data/2015/08/29/92548_logo_512x512.png", //Logo
                    "Andreessen Horowitz, Bessemer Venture Partners, Firstmark Capital" //investors
            },
            {
                    "EpicGames", //name
                    "https://media.bizj.us/view/img/1806741/epicgamestwitterheader*750xx1113-626-70-0.jpg", //image
                    "Tim Sweeney", //founder
                    "https://specials-images.forbesimg.com/imageserve/5c7450d54bbe6f072958d4b2/416x416.jpg?background=000000&cropX1=523&cropX2=3995&cropY1=343&cropY2=3814", //founderimage
                    "Game Industry", //type
                    "Epic Games is an American video game development company best known for its successful Gears of War series of games as well as its Unreal Engine technology. Its subsidiaries are Chair Entertainment, People Can Fly, and Titan Studios.", //overview
                    "15 Billion USD", //valuation
                    "https://cdn2.unrealengine.com/Epic+Games+Node%2Fxlarge_whitetext_blackback_epiclogo_504x512_1529964470588-503x512-ac795e81c54b27aaa2e196456dd307bfe4ca3ca4.jpg", //Logo
                    "Tencent Holdings, KKR, Smash Ventures" //investors
            },
            {
                    "Go-Jek", //name
                    "https://lh6.googleusercontent.com/proxy/ZN5SS5UywZYGmGsI79uKxSUd2yyghCA3i2Fpai15lg7tKbiheprEx15sJp-kz7tBMtqjQ9XcGBx1tTCelwBr0cw-14qw6EiAXKpmqEk=s0-d", //image
                    "Nadiem Makarim", //founder
                    "https://cdn.ey.com/events/weoy2018/images/country-winners/EY-indonesia-winner.jpg", //founderimage
                    "On-Demand", //type
                    "GO-JEK is a social enterprise that partners with a group of drivers to deliver a one-stop-shop convenience service for Indonesians. GO-JEK is an on-demand service provider offering a variety of complete services starting from transportation, logistics, payment, food delivery, and other on-demand services, by connecting users to driver partners.", //overview
                    "10 Billion USD", //valuation
                    "http://yopiefranz.com/wp-content/uploads/2017/07/GOJEK-Lampung.jpg", //Logo
                    "Formation Group, Sequoia Capital India, Warburg Pincus" //investors
            },
            {
                    "Coinbase", //name
                    "https://mondrian.mashable.com/uploads%252Fcard%252Fimage%252F793662%252Fd5f20ca3-4271-45fe-ba2f-15d81a93f320.jpg%252F950x534__filters%253Aquality%252890%2529.jpg?signature=QovPIC-TB3Xj1lPgu2dBiLaBpWA=&source=https%3A%2F%2Fblueprint-api-production.s3.amazonaws.com", //image
                    "Brian Armstrong", //founder
                    "https://pbs.twimg.com/profile_images/1039744169026224128/Ne3vqMhM_400x400.jpg", //founderimage
                    "Fintech", //type
                    "Coinbase is a bitcoin wallet and platform where merchants and consumers can transact with digital currencies like bitcoion, ethereum, and litecoin.", //overview
                    "9 Billion USD", //valuation
                    "https://www.coinbase.com/assets/mobile/store_listing_icon-ffbf3ec7c91090dd1f403464fad41560dac96ce04b7d86e7a459ea09c6522c18.png", //Logo
                    "Y Combinator, Union Square Ventures, DFJ Growth" //investors
            },
            {
                    "Tokopedia", //name
                    "https://asset.kompas.com/crop/53x0:953x600/750x500/data/photo/2017/04/06/2361720932.jpeg", //image
                    "William Tanuwijaya", //founder
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/William_Tanu.png/220px-William_Tanu.png", //founderimage
                    "Marketplace", //type
                    "Tokopedia is an Indonesian-based online-mall that brings together buyers and sellers to allow online transactions securely and comfortably.", //overview
                    "7 Billion USD", //valuation
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLbMOz3FQGktO5PvNC17Jd2eX6T4bCqHM51VDf0lbSEnpZOPz-", //Logo
                    "SoftBankGroup, Alibaba Group, Sequoia Capital India" //investors
            },
            {
                    "Unity Technologies", //name
                    "https://d15shllkswkct0.cloudfront.net/wp-content/blogs.dir/1/files/2015/04/Unite-2015-Tokyo-Unity-Technologies.jpg", //image
                    "David Helgason", //founder
                    "https://d1qb2nb5cznatu.cloudfront.net/users/33507-large?1431957845", //founderimage
                    "Game Industry", //type
                    "Unity Technologies creates flexible and high-performance end-to-end development platform used to create interactive 2D, 3D, VR, and AR experiences. Unity's graphics engine and full-featured editor serve as the foundation to develop games or apps and easily bring them to multiple platforms: mobile devices, home entertainment systems, personal computers, and embedded systems.", //overview
                    "3 Billion USD", //valuation
                    "https://images.techhive.com/images/article/2015/03/unity-logo-100571261-large.jpg", //Logo
                    "Sequoia Capital, iGlobe Partners, DFJ Growth" //investors
            },
            {
                    "Databricks", //name
                    "https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjppbaz3tnhAhW863MBHbTwDssQjRx6BAgBEAU&url=https%3A%2F%2Fwww.glassdoor.co.uk%2FPhotos%2FDatabricks-Office-Photos-IMG1299842.htm&psig=AOvVaw3KEHE5O4DokuQ9pqmsknmw&ust=1555680169430572", //image
                    "Ali Ghodsi", //founder
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Wake_up_People-_AI_is_eating_at_all_of_your_jobs_%2839392994925%29_%28cropped%29.jpg/220px-Wake_up_People-_AI_is_eating_at_all_of_your_jobs_%2839392994925%29_%28cropped%29.jpg", //founderimage
                    "Internet Software & Services", //type
                    "Databricks seeks to empower anyone to easily build and deploy advanced analytics solutions. Databricks provides a just-in-time data platform, to simplify data integration, real-time experimentation, and robust deployment of production applications.", //overview
                    "2.7 Billion Dollar", //valuation
                    "https://i.vimeocdn.com/portrait/18609368_300x300", //Logo
                    "Andreessen Horowitz, New Enterprise Associates, Battery Ventures" //investors
            },
            {
                    "SpaceX", //name
                    "https://spacenews.com/wp-content/uploads/2018/02/fh-launch-spx.jpg", //image
                    "Elon Musk", //founder
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Elon_Musk_Royal_Society.jpg/220px-Elon_Musk_Royal_Society.jpg", //founderimage
                    "Space Exploration", //type
                    "SpaceX designs, manufactures and launches advanced rockets and spacecraft.", //overview
                    "18.5 Billion USD", //valuation
                    "https://i.ebayimg.com/images/g/42sAAOSwoLpaf7Re/s-l300.png", //Logo
                    "Founders Fund, Draper Fisher Jurvetson, Rothenberg Ventures" //investors
            }
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
