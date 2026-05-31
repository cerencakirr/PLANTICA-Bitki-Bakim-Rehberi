package bitkibakimi;

import java.util.ArrayList;

public class Meyve extends Bitki {

    private String bakimBilgisi;
    private String detayliBilgi;
    private String gorselYolu;

    public Meyve(String isim, String bilimselIsim, String bakimBilgisi, String detayliBilgi, String gorselYolu) {
        super(isim, bilimselIsim);
        this.bakimBilgisi = bakimBilgisi;
        this.detayliBilgi = detayliBilgi;
        this.gorselYolu = gorselYolu;
    }

    @Override
    public String getBakimBilgisi() {
        return bakimBilgisi;
    }

    @Override
    public String getDetayliBilgi() {
        return detayliBilgi;
    }

    @Override
    public String getGorselYolu() {
        return gorselYolu;
    }

    public static ArrayList<Meyve> getMeyveTuruListesi() {
        ArrayList<Meyve> meyveler = new ArrayList<>();

        meyveler.add(new Meyve("Elma", "Malus domestica",
        	    """
        	    Elma ağaçları, sonbaharda tohumdan yetiştirilebilir; ancak verimli türler için aşılı fidanlar tercih edilmelidir. Ilıman iklimi, humuslu ve iyi drene edilmiş toprakları sever. Güneşli alanlarda daha fazla verim verir. İlkbahar ve yaz aylarında düzenli sulama yapılmalıdır. Budama, hastalık kontrolü ve gübreleme ile sağlıklı büyüme desteklenir. Elma iç kurdu gibi zararlılar için önlem alınmalıdır.
        	    """,
        	    """
        	    Elma, yüzyıllardır hem besleyici değeri hem de sembolik anlamlarıyla bilinir. Tatlıdan ekşiye uzanan çeşitleriyle sofraların vazgeçilmezidir. Taze tüketimin yanı sıra suyu, kurusu, sirke ve tatlı yapımında da kullanılır. Türkiye’nin hemen her bölgesinde yetiştirilen elma, bol lifli ve C vitamini içeren sağlıklı bir meyvedir.
        	    """,
        	    "elma.jpg"
        	));

        	meyveler.add(new Meyve("Armut", "Pyrus",
        	    """
        	    Armut tohumları ilkbaharda ekilir ancak çoğunlukla aşılı fidanla dikimi tercih edilir. Ilıman ve nemli iklim koşullarını sever. Güneşli alanlarda meyve kalitesi artar. Toprak hafif asidik, humuslu ve geçirgen olmalıdır. Düzenli sulama yapılmalı, yazın su ihtiyacı artar. Ağaç yapısı gereği geniş alana ihtiyaç duyar. Ateş yanıklığı gibi hastalıklara karşı dikkatli olunmalıdır.
        	    """,
        	    """
        	    Armut, yumuşak ve sulu dokusuyla sevilen bir meyvedir. Çeşidine göre tatlı, aromatik veya mayhoş olabilir. Taze tüketimin yanı sıra komposto ve reçel yapımında da kullanılır. Yüksek lif oranı sayesinde sindirim sistemi için faydalıdır. Türkiye’de özellikle Marmara ve Ege bölgelerinde yaygın olarak yetişir.
        	    """,
        	    "armut.jpg"
        	));

        	meyveler.add(new Meyve("Kiraz", "Prunus avium",
        	    """
        	    Kiraz ağaçları güneşli ve yüksek rakımlı bölgelerde verimli olur. İlkbaharda dikilir, soğuklama ihtiyacı olan bir meyvedir. Kumlu-tınlı ve iyi drene edilmiş topraklar tercih edilir. Sulama özellikle çiçeklenme ve meyve oluşumunda düzenli yapılmalıdır. Ağaçlar geniş taç oluşturduğundan budama ile kontrol sağlanmalıdır. Kuş zararı yaygındır, ağ ile koruma yapılabilir.
        	    """,
        	    """
        	    Kiraz, bahar aylarında çiçek açarak estetik bir görüntü sunar ve yazın ilk meyvesi olarak sevilerek tüketilir. Antioksidan içeriği yüksektir ve bağışıklık sistemine katkı sağlar. Tatlı ve ekşi çeşitleri bulunur. Türkiye, dünya kiraz üretiminde ilk sıralarda yer alır, özellikle Isparta ve Afyon öne çıkar.
        	    """,
        	    "kiraz.jpg"
        	));

        	meyveler.add(new Meyve("Muz", "Musa",
        	    """
        	    Muz, tropikal ve subtropikal iklimlerde yetişir. 25-30°C sıcaklık idealidir. Yüksek nem, bol güneş ve korunaklı alan ister. Organik maddece zengin topraklar tercih edilir. Sık ve kontrollü sulama gerekir. Rüzgara duyarlıdır, destekleme yapılmalıdır. Yılda bir kez çiçeklenir ve meyve verir. Hasattan sonra ana gövde kesilerek genç sürgünlere yer açılır.
        	    """,
        	    """
        	    Muz, potasyum ve enerji açısından zengin bir meyvedir. Sporcular ve çocuklar için faydalı bir atıştırmalıktır. Türkiye’de Anamur ve Alanya gibi Akdeniz iklimine sahip bölgelerde yetiştirilmektedir. Taze tüketiminin yanı sıra smoothie, kek ve dondurma gibi tariflerde de sık kullanılır.
        	    """,
        	    "muz.jpg"
        	));

        	meyveler.add(new Meyve("Portakal", "Citrus sinensis",
        	    """
        	    Portakal ağaçları subtropikal iklimlerde yetişir. Don riskinin düşük olduğu bölgelerde ekilir. Killi-tınlı ve hafif asidik topraklar uygundur. İlkbaharda çiçeklenir, kış aylarında meyve verir. Düzenli sulama ve dengeli gübreleme ile verim artırılır. Kabuk böceği ve turunçgil gal arısı gibi zararlılar kontrol edilmelidir. Budama ile taç şekli korunur.
        	    """,
        	    """
        	    Portakal, özellikle kış aylarının vazgeçilmez meyvesidir. C vitamini açısından zengindir, bağışıklık sistemini güçlendirir. Türkiye’de Adana, Antalya ve Mersin gibi sıcak iklim bölgelerinde yetiştirilir. Meyve suyu, reçel ve tatlılarda kullanımı yaygındır. Ayrıca kabuğundan esans ve aromatik yağ üretilir.
        	    """,
        	    "portakal.jpg"
        	));

        	meyveler.add(new Meyve("Çilek", "Fragaria",
        	    """
        	    Çilek, ilkbaharda dikilir ve yaz boyunca meyve verir. Gevşek, organik maddece zengin topraklar idealdir. Güneşli alanları sever, ancak aşırı sıcaklarda gölge sağlayan sistemler kurulabilir. Gün aşırı sulama yapılmalıdır. Yabancı ot kontrolü önemlidir. Yerden yükseltilmiş sıralarda yetiştirmek hastalık riskini azaltır. Çiçekler dona karşı hassastır.
        	    """,
        	    """
        	    Çilek, tatlı ve aromatik tadıyla özellikle çocukların favori meyvesidir. Kalp şeklindeki meyvesiyle romantizmin de simgesidir. Taze tüketildiği gibi reçel, marmelat ve pasta yapımında da kullanılır. Türkiye’de Aydın, Bursa ve Mersin bölgelerinde yaygın üretimi vardır.
        	    """,
        	    "cilek.jpg"
        	));

        	meyveler.add(new Meyve("Üzüm", "Vitis",
        	    """
        	    Üzüm asmaları ilkbaharda dikilir ve tam güneş alan, iyi hava sirkülasyonu olan alanlarda yetiştirilir. Kumlu-tınlı, geçirgen ve kireçli topraklarda en iyi sonucu verir. Sulama gelişim döneminde önemlidir, fakat hasat öncesi azaltılmalıdır. Bağ budaması verimi ve meyve kalitesini artırır. Salkım güvesi gibi zararlılara karşı ilaçlama yapılmalıdır.
        	    """,
        	    """
        	    Üzüm, binlerce yıldır şarap, pekmez ve kuru yemiş üretiminde kullanılır. Siyah, yeşil, mor ve kırmızı çeşitleri vardır. Antioksidan, resveratrol ve demir açısından zengin bir meyvedir. Türkiye’nin Ege Bölgesi, özellikle Manisa, üzüm üretiminde liderdir.
        	    """,
        	    "uzzum.jpg"
        	));

        	meyveler.add(new Meyve("Kavun", "Cucumis melo",
        	    """
        	    Kavun sıcak iklimi sever. Tohumları ilkbaharda ekilir. Gevşek yapılı, hafif kumlu ve iyi drene edilmiş topraklarda gelişir. Bol güneş ister. Sulama düzenli olmalı; meyve oluşumu sırasında su miktarı dikkatle ayarlanmalıdır. Aşırı sulama meyvenin tadını bozabilir. Hasat, kabuk sararıp aroması belirginleştiğinde yapılır.
        	    """,
        	    """
        	    Kavun, ferahlatıcı ve tatlı tadıyla yaz meyvelerinin başında gelir. İçeriğinde A ve C vitamini, bol miktarda su ve lif bulunur. Dilimlenerek taze tüketilir, bazı yörelerde peynirle birlikte sunulur. Türkiye'de Konya, Manisa ve Adana gibi bölgelerde yaygın olarak yetiştirilir.
        	    """,
        	    "kavun.jpg"
        	));

        	meyveler.add(new Meyve("Ananas", "Ananas comosus",
        	    """
        	    Ananas tropikal iklim meyvesidir. 25-32°C arası sıcaklıklar idealdir. Yüksek nem ve güneş ister. Hafif asidik, humuslu topraklarda yetişir. Fideyle çoğaltılır ve yaklaşık 18–24 ayda ilk meyvesini verir. Sulama düzenli yapılmalı, toprak tamamen kurumamalıdır. Meyve oluşumunda azotlu gübre destek sağlar.
        	    """,
        	    """
        	    Ananas, egzotik tadı ve hoş aromasıyla tropik meyvelerin en tanınanıdır. Taze tüketiminin yanı sıra meyve suyu, konserve ve tatlı yapımında kullanılır. İçerdiği bromelain enzimi sayesinde sindirimi destekler. Türkiye’de sınırlı bölgelerde (örneğin seralarda) üretimi yapılabilmektedir.
        	    """,
        	    "ananas.jpg"
        	));

        	meyveler.add(new Meyve("Avokado", "Persea americana",
        	    """
        	    Avokado, subtropikal iklim bitkisidir. 10°C altındaki sıcaklıklardan korunmalıdır. Organik maddece zengin, gevşek ve iyi drene topraklarda yetişir. Güneş ışığını sever. Genellikle aşılı fidanla dikimi yapılır. Sulama düzenli olmalı, fakat kök boğazı su altında kalmamalıdır. Çiçekleri çift cinsiyetli olmasına rağmen döllenme için arılar gereklidir.
        	    """,
        	    """
        	    Avokado, son yıllarda sağlıklı beslenmenin yıldızı olmuştur. İçerdiği doymamış yağlar, potasyum, E ve K vitaminleri ile kalp dostudur. Ezme (guacamole), salata ve tostlarla birlikte kullanımı yaygındır. Türkiye’de özellikle Antalya ve Alanya çevresinde üretimi yaygındır.
        	    """,
        	    "10.jpg"
        	));

        return meyveler;
    }
}

