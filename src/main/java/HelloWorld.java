/**
 * Created by admin on 23/2/17.
 */
import static spark.Spark.*;
public class HelloWorld {
    public static void main(String[] args) {
        get("/GetUserInfo",
                (request, response) ->
                {
                    response.status(200);
                    response.type("application/json");
                    return "{\"Result\": \"1\",\"ID\":\"E0A6990\",\"UserName\":\"quang.pham\",\"idCountry\":\"69dcb089-9744-44f1-b536-b6017ee45d1b\",\"CountryName\":\"Vietnam\",\"idArea\":\"f544ca18-df9d-4b61-a81d-549a40b685fc\",\"AreaName\":\"South \",\"idProvince\":\"ce2796a5-1920-4144-9490-d1e7ae2fe025\",\"ProvinceName\":\"TP. Ho Chi Minh \",\"idCity\":\"ddb4b741-0521-4ae6-af5b-84061e97613f\",\"CityName\":\"TP. Ho Chi Minh \",\"idBranch\":\"c11fdcac-74d7-4b36-819d-abbb0769aaf0\",\"BranchName\":\"Cao Phong Dist 5 \",\"idShop\":\"7d07ca68-3cfd-4a55-9a63-d46625a1e9d1\",\"ShopName\":\"Cao Phong Dist 5 \",\"Bulletin\":[{\"No\":\"3c8b9e78-56d4-4b19-9264-60532bd4dec7\",\"Content\":\"[2016/04/04 20:34:32] C·c b?n PG n?u khÙng k?t n?i du?c 3G thÏ ki?m tra t‡i kho?n, n?u h?t ti?n s? khÙng t? d?ng gia h?n m‡ c·c b?n ph?i nh?n tin theo c˙ ph?p \\\"D70 S? di?n tho?i dÍn 9123\\\" d? gia h?n\"},{\"No\":\"87507a9e-8d68-4c5b-8bf1-ec6a3ee859db\",\"Content\":\"[2016/03/08 19:58:40] M?i ngu?i ch˙ ˝ c?p nh?t ph?n m?m m?i theo hu?ng d?n d„ g?i qua mail d? cÛ th? nh?p don v? = 0 khi khÙng b·n du?c h‡ng trong ng‡y. Xin c·m on\"},{\"No\":\"a3335f27-1e6e-4be9-9c35-ec9fda4fef5c\",\"Content\":\"[2016/03/02 11:12:53] M?i ngu?i luu ˝ c·ch nh?p gi· b·n: vui lÚng khÙng nh?p 3 s? 0 ? cu?i gi· vÏ don v? tÌnh gi· l‡ KVND. VÌ d?: 7,990,000 thÏ ch? nh?p 7990\"}],\"Timeout\":\"6\",\"Currency\":\"KVND\",\"Today\":\"22/02/2017\",\"ServerTime\":\"21:33:29\",\"ServerDate\":{\"BeforeDate\":\"21/02/2017\",\"ServerDate\":\"22/02/2017\",\"AfterDate\":\"23/02/2017\",\"PreviousWeekNo\":\"7\",\"StartDate\":\"13/02/2017\",\"EndDate\":\"19/02/2017\"}}";
                });
    }
}
