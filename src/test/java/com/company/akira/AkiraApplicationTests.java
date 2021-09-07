package com.company.akira;

import com.company.akira.model.*;
import com.company.akira.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AkiraApplicationTests {

    @Autowired
    private PharmacyRepository repository;
    @Autowired
    private AutoServiceRepository autoServiceRepository;
    @Autowired
    private AutoSpareRepository spareRepository;
    @Autowired
    private BeautySalonRepository beautySalonRepository;
    @Autowired
    private RefuelingRepository refuelingRepository;
    @Autowired
    private HomeApplianceStoreRepository homeApplianceStoreRepository;
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private SanatoriumRepository sanatoriumRepository;
    @Autowired
    private SmartphoneStoreRepository smartphoneStoreRepository;
    @Autowired
    private FitnessClubRepository fitnessClubRepository;

    String[][] arr = {
            {"ARZON APTEKA", "71 2180006", "https://yandex.uz/map-widget/v1/-/CCUmuPuY0B", "/images/apteka1.jpg", "Shahar: TOSHKENT Tuman: Shayxontohur JAR-ARIK ko\'chasi, IBN SINO-2 dahasi, 7B"},
            {"TASHAPTEKA", "71 2681509", "https://yandex.uz/map-widget/v1/-/CCUmuPRHKB", "/images/apteka2.jpg", "Shahar: TOSHKENT Tuman: Mirzo-Ulug\'bek BUYUK IPAK YO\'LI ko\'chasi, 105/2"},
            {"A5", "+99899 8731851", "https://yandex.uz/map-widget/v1/-/CCUmuPfe~B", "/images/apteka3.jpg", "Shahar: TOSHKENT Tuman: Chilonzor MUKIMI kochasi, 1/1"},
            {"А7", "+99893 0036446", "https://yandex.uz/map-widget/v1/-/CCUmuPGcOA", "/images/apteka4.jpg", "Shahar: TOSHKENT Tuman: Chilonzor CHAPANOTA kochasi, CHILONZOR-2 mavzesi, 58"},
            {"HEALTHMART DORIXONASI", "71 2317755", "https://yandex.uz/map-widget/v1/-/CCUmuPwVgD", "/images/apteka5.jpg", "Shahar: TOSHKENT Tuman: Olmazor FAROBIY ko\'chasi, 448D"}};

    String[][] arr0 = {
            {" IMAGINE MChJ", "+99893 5021702", "https://yandex.uz/map-widget/v1/-/CCUmyHXB1B", "IMAGINE.jpg", "TOSHKENT Tuman: Yunusobod 1-chi YANGITARNOV {eski nomi IBROXIM AHMAD kochasi} tor kochasi, 12"},
            {"EVACUATOR.UZ", "+99890 9999909", "https://yandex.uz/map-widget/v1/-/CCUmyLeXSC", "EVACUATOR.jpg", "TOSHKENT Tuman: Mirzo-Ulugbek 1-chi YANGITARNOV {eski nomi IBROXIM AHMAD kochasi} tor kochasi, 8"},
            {" DISK OSIYO", "+99891 1352169", "https://yandex.uz/map-widget/v1/-/CCUmyLu5dB", "DISK OSIYO.png", "TOSHKENT Tuman: Sirgali YANGI SIRGALI YOLI kochasi, 6A"},
            {"SAKA DOKONI", "71 2769737", "https://yandex.uz/map-widget/v1/-/CCUmyLBUTC", "saka.png", "TOSHKENT Tuman: Chilonzor SOBIR YUSUPOV {KICHIK XALQA YOLI} kochasi, CHILONZOR-10 mavzesi, 38/63"},
            {" MANNOL SAVDO BELGISI", "78 1505540", "https://yandex.uz/map-widget/v1/-/CCUmyLRaSA", "mannol.png", "TOSHKENT Tuman: Mirzo-Ulugbek MUSTAQILLIK shoh kochasi, 88"}};


    String[][] arr1 = {
            {"GM МАГАЗИН АВТОЗАПЧАСТЕЙ", "+99898 3135554", "https://yandex.uz/map-widget/v1/-/CCUmuPAWTA", "GM.png", "Город: ТАШКЕНТ Район: Учтепинский ул. КИЧИК ХАЛКА ЙУЛИ {МАЛАЯ КОЛЬЦЕВАЯ}, 37/39"},
            {"2. ZERO ENERGY GIBRID МАГАЗИН АВТОЗАПЧАСТЕЙ", "+99893 5570627", "https://yandex.uz/map-widget/v1/-/CCUmuPaT9B", "ZERO ENERGY GIBRID.png", "Город: ТАШКЕНТ Район: Учтепинский кв-л ЧИЛАНЗАР-26, ул. КАТТА ХИРМОНТЕПА, 29А"},
            {" ZIP.UZ МАГАЗИН АВТОЗАПЧАСТЕЙ", "+99899 8080055", "https://yandex.uz/maps/org/zip_uz/156753624759",""},
            {"VOSTOK SPEC TEHNIK ООО", "+99890 3496973", "https://yandex.uz/map-widget/v1/-/CCUmuTFXXA", "VOSTOK SPEC.png", "Город: ТАШКЕНТ Район: Яккасарайский ул. Ш.РУСТАВЕЛИ, 36"}};

    String[][] arr2 = {
            {"MIRXOSIL АЗС", "71 2267523", "https://yandex.uz/map-widget/v1/-/CCUmyLb7XC", "MIRXOSIL.png", "Город: ТАШКЕНТ Район: Алмазарский ул. КИЧИК ХАЛКА ЙУЛИ {МАЛАЯ КОЛЬЦЕВАЯ},"},
            {"ARENA. PETROL AND CNG АЗС", "+99899 7950011", "https://yandex.uz/map-widget/v1/-/CCUmyLrf3B", "arena.png", "Город: ТАШКЕНТ Район: Яшнабадский ул. КАРАСУ,"},
            {"AZADBASH АЗС", "--------------", "https://yandex.uz/map-widget/v1/-/CCUmyLHvDA", "AZADBASH.jpg", "Регион: Ташкентская область Город: КИБРАЙСКИЙ Р-Н пос. НЕИЗВЕСТЕН,"},
            {"AZS АЗС", "--------------", "https://yandex.uz/map-widget/v1/-/CCUmyPt5DD", "AZS.png", "Город: ТАШКЕНТ Район: Учтепинский ул. ТОШКЕНТ ХАЛКА АВТОМОБИЛ ЙУЛИ {ТКАД}, 7"}};

    String[][] arr3 = {
            {"WOMEN & KIDS CARE CENTRE", "+99893 6028448", "https://yandex.uz/map-widget/v1/-/CCUmuLf-OD", "womenkids", "Mintaqa: Toshkent viloyati Shahar: YANGIYOL {TOSH. VIL.} SAMARQAND kochasi, 123/1"},
            {" HEALTHY SKIN DERMATOLOGIYA VA KOSMETOLOGIYA TIBBIYOT MARKAZI {", "	{+99890} 1856503 71 2526608 {+99898} 3376601", "https://yandex.uz/map-widget/v1/-/CCUmuLCPSC", "HealthySkin", " Город: ТАШКЕНТ Район: Мирабадский ул. БУЮК ТУРОН, 73"},
            {"ALFA STYLE GOZALLIK SALONI", "71 2815008", "https://yandex.uz/map-widget/v1/-/CCUmuLw5tB", "belaya lady", "Shahar: TOSHKENT Tuman: Mirobod MIRABAD bozori,", "soqqali"},
            {"CHALLENGE RIVOJLANTIRISH MARKAZ", "+99897 7070762", "https://yandex.uz/map-widget/v1/-/CCUmuLT~tA", "Hallange", "Shahar: TOSHKENT Tuman: Mirzo-Ulugbek CHUST kochasi, 1", "swss"},
            {"BAROKKO GOZALLIK SALONI ", "+99890 3594489", "https://yandex.uz/map-widget/v1/-/CCUmuLdtxA", "BAROKKO GOZALLIK SALONI ", "Tuman: Chilonzor FURQAT kochasi, OLMAZOR dahasi, 15/1", " GOZALLIK SALONI "}};


    String[][] arr4 = {
            {"BETA KANTELYARIYA BUTIKI", "	78 1223333 71 2330332 78 1220544 71 2562660", "https://yandex.uz/map-widget/v1/-/CCUmyHCTgB", "beta", "Shahar: TOSHKENT Tuman: Mirobod ISLOM KARIMOV {eski nomi OZBEKISTON shoh kochasi} kochasi, 17"},
            {"CHILONZOR SAVDO UYI MChJ", "+99890 9803356", "https://yandex.uz/map-widget/v1/-/CCUmyHGXCD", "CHILONZOR", "Shahar: TOSHKENT Tuman: Chilonzor BUNYODKOR shoh kochasi, CHILONZOR-C mavzesi, 42/109"},
            {"SKREPKA EXPO XK", "71 2896162", "https://yandex.uz/map-widget/v1/-/CCUmyHSV1B", "SKREPKA ", "Shahar: TOSHKENT Tuman: Yashnobod PAHLAVON MAHMUD {eski nomi 2-chi tor kochasi TARAQQIYOT, 2-chi tor kochasi PAHLAVON MAHMUD} kochasi, 33"},
            {"IKLIM.UZ IQLIM TEXNIKASI INTERNET DOKONI", "71 2000232", "https://yandex.uz/map-widget/v1/-/CCUmyHS~2B", "IKLIM", "Shahar: TOSHKENT Tuman: Chilonzor ARNASOY {eski nomi PIONERSKAYA} kochasi, 7A", "XONADA SOGLOM IQLIM VA TOZA HAVO"},
            {"ELEKTRO SAVDO BIZNES MChJ", "71 2280097", "https://yandex.uz/map-widget/v1/-/CCUmyHcUcB", "ELEKTRO", "Mamlakat: Ozbekiston Shahar: TOSHKENT Tuman: Olmazor USTA SHIRIN kochasi, 134A", "Nasoslarning keng turi!"}};


    String[][] arr5 = {
            {"DONOMED KLINIKASI", "71 2425972", "https://yandex.uz/map-widget/v1/-/CCUmuHxAxB", "Donomed", "Tuman: Shayxontohur MATKABULOV kochasi, 1"},
            {" NSS MEDICAL CENTER", "78 1294677", "https://yandex.uz/map-widget/v1/-/CCUmuLQn8B", "NSS MEDICAL CENTER", "Shahar: TOSHKENT Tuman: Olmazor FAROBIY kochasi, 449B Moljalar: MAKRO SUPERMARKETI - FAROBIY KOCHASI; KOK-SAROY"},
            {"VEDA STOM STOMATOLOGIK KLINIKA ", "71 2540400", "https://yandex.uz/map-widget/v1/-/CCUmuTw89A", "vedostamp", "Shahar: TOSHKENT Tuman: Mirobod NUKUS kochasi, 88/37"},
            {"PRESTIGE HEALTH GROUP XUSUSIY KLINIKASI", "+99895 3420101", "https://yandex.uz/map-widget/v1/-/CCUmuTdvWD", "PRESTIGE ", "Shahar: TOSHKENT Tuman: Yunusobod CHINOBOD {eski nomi A.ZAKIROV} kochasi, 88"},
            {"GAVHAR KLINIKASI", "71 2087793", "https://yandex.uz/map-widget/v1/-/CCUmuXrj-B", "GAVHAR", "Shahar: QIBRAY TUMANI SALAR shaharchasi, FAZOKORLAR kochasi, 46"}};

    String[][] arr6 = {
            {"ZANGIOTA ZAM-ZAM", "+99898 3011897", "https://yandex.uz/map-widget/v1/-/CCUmuTAaDB", "ZAM-ZAM", "Shahar: ZANGIOTA TUMANI URTAAUL shaharchasi, NAVOIY kochasi, 70", "ZANGIOTA ZAM-ZAM SANATORIYASI"},
            {"SUKOK SANATORIYASI - PARKENT TUMANI", "999899898", "https://yandex.uz/map-widget/v1/-/CCUmuTamXD", "SUKOK", "Mintaqa: Toshkent viloyati Shahar: PARKENT TUMANI SOQOQ shaharchasi,"},
            {"CHATKAL SANATORIYASI", "+99895 5120040", "https://yandex.uz/map-widget/v1/-/CCUmuTVupA", "CHATKAL", "Mintaqa: Toshkent viloyati Shahar: GAZALKENT IBN SINO kochasi,"}};


    String[][] arr7 = {
            {"JAYRON KREDIT", "71 2006655", "https://yandex.uz/map-widget/v1/-/CCUmyLC6CC", "jayron", "Shahar: TOSHKENT Tuman: Olmazor QORASOROY kochasi, 2/38"},
            {"YENGIL KREDIT", "71 2636117", "https://yandex.uz/map-widget/v1/-/CCUmyLSZTC", "MILLIY ", "Shahar: QIBRAY TUMANI TEMUR MALIK kochasi, 3"},
            {"KRISTAL KREDIT", "71 2254421", "https://yandex.uz/map-widget/v1/-/CCUmyLcIoB", "KRISTAL ", "Shahar: TOSHKENT Tuman: Yunusobod YUNUSOBOD-11 mavzesi, AHMAD DONISH kochasi, 2/64"}};


    String[][] arr8 = {
            {"CREDITON.UZ TELEFONLAR VA AKSESSUARLARNING INTERNET DOKONI ", "78 1130408", "https://yandex.uz/map-widget/v1/-/CCUmyHsS-C", "CREDITON", "Shahar: TOSHKENT Tuman: Shayxontohur A.QODIRIY kochasi, LABZAK {M-13} dahasi, 1"},
            {"MAC BRO MChJ ", "78 7772020", "https://yandex.uz/map-widget/v1/-/CCUmyHH9~C>", "MAC-BRO", "Shahar: TOSHKENT Tuman: Shayxontohur NAVOIY shoh kochasi, 27",},
            {"RADIUS MOBILE ELEKTRONIKA DOKONI", "71 2003100", "https://yandex.uz/map-widget/v1/-/CCUmyHX0cA", "RADIUS ", "Shahar: TOSHKENT Tuman: Shayxontohur KICHIK XALQA YOLI kochasi, 59"},
            {"Openshop", "+99871 200 66 60", "https://yandex.uz/map-widget/v1/-/CCUmyLVtpB", "openshop", "город Ташкент, Мирзо-Улугбекский район, Буз сув 2 - 69"},
            {"mobiuz", " +998 97 140 08 96", "https://yandex.uz/maps/-/CCUmyLf9WA", "mobiuz", " Узбекистан, Ташкент, ул. Буюк Ипак Йули, 59"}};


    String[][] arr9 = {
            {"CHALLENGE RIVOJLANTIRISH MARKAZ", "+99897 7070762", "https://yandex.uz/map-widget/v1/-/CCUmuHT~HA", "CHALLENGE.png", "Shahar: TOSHKENT Tuman: Mirzo-Ulugbek CHUST kochasi, 1"},
            {"STENBRIDGE FITNES-MARKAZI", "+99890 3566585", "https://yandex.uz/map-widget/v1/-/CCUmuHh9DC", "STENBRIDGE.png", "Shahar: TOSHKENT Tuman: Shayxontohur A.QODIRIY kochasi, 1A"},
            {" CROSSFIT 998", "+99898 2771166", "https://yandex.uz/map-widget/v1/-/CCUmuHxlLC", "CROSSFIT 998.jfif", "Город: ТАШКЕНТ Район: Яккасарайский ул. БАБУРА, 73А"},
            {"MAGIC GALAXY СЕМЕЙНЫЙ СПОРТИВНО-ОЗДОРОВИТЕЛЬНЫЙ КОМПЛЕКС", "71 2077171", "https://yandex.uz/map-widget/v1/-/CCUmuLUatA", "magicgalaxy.jfif", "Город: ТАШКЕНТ Район: Учтепинский ул. ЗАРГАРЛИК, 46А"},
            {" MEGAFITNESS", "+99890 3598030", "https://yandex.uz/map-widget/v1/-/CCUmuLuHoC", "MEGAFITNESS.jfif", "Город: ТАШКЕНТ Район: Яшнабадский ул. ФАРГОНА ЙУЛИ, 19"}};


    String[][] arr10 = {{"ZIYO NUR", "+99893 5983173", "https://yandex.uz/map-widget/v1/-/CCUmu2aQwA", "ZARGARLIK", "Shahar: TOSHKENT Tuman: Chilonzor CHILONZOR-C mavzesi, BUNYODKOR shoh kochasi, 52/2"},
            {"FONON ZARGARLIK ZAVODI", "71 2052222", "https://yandex.uz/map-widget/v1/-/CCUmu2R6cB", "FONON", "Shahar: TOSHKENT Tuman: Chilonzor KICHIK XALQA YOLI kochasi, CHILONZOR-9 mavzesi, 50"},
            {"GLAZ ALMAZ", "+99898 3038787", "https://yandex.uz/map-widget/v1/-/CCUmu2rg1D", "GLAZ ", "Shahar: TOSHKENT Tuman: Yashnobod AVIASOZLAR-2 dahasi, BESHARIQ kochasi, 41/199"},
            {"RUBIN ZARGARLIK DOKONI", "+99893 5677171", "https://yandex.uz/map-widget/v1/-/CCUmu2SocC", "RUBIN", "Shahar: TOSHKENT Tuman: Chilonzor CHILONZOR-C mavzesi, 8/1A", "RUBIN"},
            {"SEREBRO ZARGARLIK DOKONI", "+99897 7711424", "https://yandex.uz/map-widget/v1/-/CCUmu2sPTC", "SEREBRO", "Tuman: Chilonzor CHILONZOR-C mavzesi, BUNYODKOR shoh kochasi, 52/2"},
            {"ARGENTO BELLO ZARGARLIK DOKONI ", "+99890 3505222", "https://yandex.uz/map-widget/v1/-/CCUmyHvzOD", "ARGENTO", "Shahar: TOSHKENT Tuman: Chilonzor CHILONZOR-C mavzesi, BUNYODKOR shoh kochasi, 52/2"},
            {"PANDORA ZARGARLIK DOKONI", "+99897 9713993", "https://yandex.uz/map-widget/v1/-/CCUmyHCqkA", "PANDORA", "Shahar: TOSHKENT Tuman: Olmazor NURAFSHON aylanma koch., 4"}};


    @Test
    void contextLoads() {
        for (int i = 0; i < arr.length; i++) {
            Pharmacy club = new Pharmacy(arr[i][0], arr[i][1], arr[i][2], arr[i][4], arr[i][3]);
            System.out.println(repository.save(club));
        }
        for (int i = 0; i < arr0.length; i++) {
            AutoService autoService = new AutoService(arr0[i][0], arr0[i][1], arr0[i][4], arr0[i][2], arr0[i][3]);
            System.out.println(autoServiceRepository.save(autoService));
        }
        /*for (int i = 0; i < arr1.length; i++) {
            AutoSpare autoSpare = new AutoSpare(arr1[i][0], arr1[i][1], arr1[i][4], arr1[i][2], arr1[i][3]);
            System.out.println(spareRepository.save(autoSpare));
        }*/
        for (int i = 0; i < arr2.length; i++) {
            Refueling refueling = new Refueling(arr2[i][0], arr2[i][1], arr2[i][4], arr2[i][2], arr2[i][3]);
            System.out.println(refuelingRepository.save(refueling));
        }
        for (int i = 0; i < arr3.length; i++) {
            BeautySalon salon = new BeautySalon(arr3[i][0], arr3[i][1], arr3[i][4], arr3[i][2], arr3[i][3]);
            System.out.println(beautySalonRepository.save(salon));
        }
        for (int i = 0; i < arr4.length; i++) {
            HomeApplianceStore applianceStore = new HomeApplianceStore(arr4[i][0], arr4[i][1], arr4[i][4], arr4[i][2], arr4[i][3]);
            System.out.println(homeApplianceStoreRepository.save(applianceStore));
        }
        /*for (int i = 0; i < arr5.length; i++) {
            Hospital hospital = new Hospital(arr[i][0], arr[i][1], arr[i][2], arr[i][4], arr[i][3]);
            System.out.println(repository.save(club));
        }*/
        for (int i = 0; i < arr6.length; i++) {
           Sanatorium sanatorium = new Sanatorium(arr6[i][0], arr6[i][1], arr6[i][4], arr6[i][2], arr6[i][3]);
            System.out.println(sanatoriumRepository.save(sanatorium));
        }
        /*for (int i = 0; i < arr7.length; i++) {
            Bank bank = new Bank(arr[i][0], arr[i][1], arr[i][2], arr[i][4], arr[i][3]);
            System.out.println(repository.save(club));
        }
        for (int i = 0; i < arr8.length; i++) {
            Pharmacy club = new Pharmacy(arr[i][0], arr[i][1], arr[i][2], arr[i][4], arr[i][3]);
            System.out.println(repository.save(club));
        }
        for (int i = 0; i < arr9.length; i++) {
            Pharmacy club = new Pharmacy(arr[i][0], arr[i][1], arr[i][2], arr[i][4], arr[i][3]);
            System.out.println(repository.save(club));
        }
        for (int i = 0; i < arr10.length; i++) {
            Pharmacy club = new Pharmacy(arr[i][0], arr[i][1], arr[i][2], arr[i][4], arr[i][3]);
            System.out.println(repository.save(club));
        }*/
    }

}
