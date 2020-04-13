package com.example.listview;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Kuldesak(1998)",
            "Petualangan Sherina(2000)",
            "Eliana, eliANA(2002)",
            "Gie(2005)",
            "Untuk Rena(2005)",
            "3 Hari Untuk Selamanya(2007)",
            "Laskar Pelangi(2008)",
            "Takut: Faces of Fear(2008)",
            "Drupadi(2008)",
            "Sang Pemimpi(2009)",
            "Atambua 39 Celcius(2012)",
            "Sokola Rimba(2013)",
            "Ada Apa Dengan Cinta 2(2016)",
            "Athiar(2016)",
            "Kulari ke Pantai(2018)",
            "Bebas(2019)"
    };

    private static String[] heroDetails = {
            "Kuldesak adalah film ansambel drama komedi hitam Indonesia yang dirilis pada tahun 1998. Segmen-segmen dalam film ini disutradarai antara lain oleh Riri Riza, Nan Achnas, Mira Lesmana, dan Rizal Mantovani, yang merupakan debut awal mereka di karier sutradara. Film ini dibintangi antara lain oleh Oppie Andaresta, Bianca Adinegoro, Ryan Hidayat, Wong Aksan, dan dibantu banyak bintang tamu yang notabene adalah aktor dan aktris Indonesia yang terkenal pada masanya, antara lain Tio Pakusadewo, Sophia Latjuba, Bucek Depp, Unique Priscilla, dan Dik Doank.",
            "Petualangan Sherina adalah film musikal untuk semua umur. Skenario dibuat oleh Jujur Prananto dan sutradara oleh Riri Riza memberikan andil yang besar sehingga film ini menghibur dan menyentuh. Musik yang ditata Elfa Secioria sejak awal termasuk mengantarkan Sherina menjadi penyanyi cilik paling terkemuka lewat album Andai Aku Besar Nanti.",
            "Eliana, Eliana adalah film drama Indonesia yang dirilis pada tahun 2002 yang disutradarai oleh Riri Riza. Selain meraih dua penghargaan pada Festival Film Indonesia 2004, film ini juga sempat dinominasikan dalam Vancouver Film Festival.",
            "Gie (2005) adalah sebuah film garapan sutradara Riri Riza. Gie mengisahkan seorang tokoh bernama Soe Hok Gie, mahasiswa Universitas Indonesia yang lebih dikenal sebagai demonstran dan pecinta alam.",
            "Sebuah cerita tentang seorang anak berusia 11 tahun. Rena (diperankan oleh Maudy Ayunda), yang sejak kecil tinggal di Rumah Matahari, sebuah panti asuhan yang damai dan penuh tawa. Di panti yang menaungi kurang lebih 30 anak itu, Rena memiliki 'adik-adik' yang sangat ia lindungi, dan ia sering membuat ulah setiap datang kunjungan calon orang tua yang ingin mengadopsi mereka.",
            "3 Hari untuk Selamanya adalah sebuah film Indonesia yang dirilis pada bulan Juni tahun 2007. Film yang disutradarai oleh Riri Riza (Petualangan Sherina, Eliana, Eliana, GIE) dan diproduksi oleh Mira Lesmana ini dibintangi oleh aktor berbakat Nicholas Saputra (Ada Apa Dengan Cinta?, Biola Tak Berdawai, Janji Joni, GIE) dan aktris berbakat Adinia Wirasti (Ada Apa Dengan Cinta, Tentang Dia, Ruang, Dunia Mereka).",
            "Laskar Pelangi (2008) adalah sebuah film garapan sutradara Riri Riza yang dirilis pada 26 September 2008. Film Laskar Pelangi merupakan karya adaptasi dari buku Laskar Pelangi yang ditulis oleh Andrea Hirata. Skenarionya ditulis oleh Salman Aristo yang juga menulis naskah film Ayat-Ayat Cinta dibantu oleh Riri Riza dan Mira Lesmana. Hingga Maret 2009, Laskar Pelangi telah ditonton oleh 4,6 juta orang, menjadikannya film terbanyak ditonton di Indonesia keempat, setelah Jelangkung dengan 5,7 Juta, Pocong 2 dengan 5,1 Juta, dan Ada Apa Dengan Cinta dengan 4,9 Juta.",
            "Takut: Faces of Fear merupakan film antologi horor dari Indonesia yang dirilis pada tahun 2008. Film ini dibintangi antara lain oleh Dinna Olivia, Fauzi Baadila, Marcella Zalianty, Shanty, Lukman Sardi, Eva Celia Latjuba, dan Mike Muliadro. Film ini diputar secara premier di Indonesia Internasional Fantastic Film Festival (iNAFFF) 2008 pada tanggal 14-23 November 2008 di Jakarta dan di Bandung tanggal 28-30 November 2008 yang diadakan oleh jaringan bioskop Indonesia Blitzmegaplex. Berbagai macam jenis film horor ditawarkan di festifal tersebut, di mana Takut menjadi salah satu film yang menjadi pusat perhatian.",
            "Drupadi adalah film drama musikal pendek Indonesia yang dirilis pada bulan Desember 2008. Film ini mengangkat kisah Drupadi dengan seting Jawa klasik. Film produksi SinemArt Pictures ini disutradarai oleh Riri Riza dengan banyak aktor terkenal, antara lain Dian Sastrowardoyo sebagai Drupadi dan Nicholas Saputra sebagai Arjuna.",
            "Sang Pemimpi adalah sebuah film Indonesia tahun 2009 yang diadaptasi dari tetralogi novel Laskar Pelangi kedua, Sang Pemimpi, karya Andrea Hirata. Film ini disutradarai oleh Riri Riza dengan produser Mira Lesmana. Pengambilan gambar rencananya dimulai di Belitung (Belitong, dalam bahasa setempat) pada 1 Juli 2009 dan dijadwalkan selesai pada 21 Agustus 2009, dan akan dilakukan di beberapa lokasi di Manggar, Tanjung Pandan, Jakarta, dan Bogor. Film ini rencananya akan tayang di bioskop di Indonesia mulai 17 Desember 2009.",
            "Atambua 39 Celcius adalah film drama Indonesia tahun 2012. Film ini dirilis di sutradarai oleh Riri Riza dan diproduseri oleh Mira Lesmana.",
            "Sokola Rimba adalah film drama Indonesia yang dirilis pada 21 November 2013. Film ini dibintangi oleh Prisia Nasution dan Nyungsang Bungo.",
            "Ada Apa dengan Cinta? 2 adalah sebuah film Indonesia produksi Miles Productions yang merupakan sekuel dari Ada Apa dengan Cinta? yang rilis tahun 2002. Film ini tayang di Indonesia pada 28 April 2016. Film ini masih dibintangi oleh pemeran film sebelumnya, termasuk Dian Sastrowardoyo sebagai Cinta dan Nicholas Saputra sebagai Rangga. Film ini berhasil meraih 3,6 juta penonton dan menjadi film Indonesia terlaris kedua tahun 2016. Selain itu kesuksesan ini juga melampaui pencapaian film pertamanya.",
            "Athirah adalah film biografi Indonesia yang dirilis pada 29 September 2016; dan diadaptasi dari 'Athirah', novel semi-biografi Hj. Athirah Kalla – ibunda Wakil Presiden Indonesia, Jusuf Kalla – karya Alberthiene Endah. Film yang mendapat dukungan penuh dari Kalla Group ini menampilkan kisah Athirah dan Jusuf Kalla ketika muda.",
            "Kulari ke Pantai adalah judul film anak-anak dan keluarga produksi terbaru Miles Films. Film yang akan menjadi film genre Komedi Drama ini digarap oleh duo produser Mira Lesmana, dan sutradara Riri Riza, yang telah berhasil mencetak dua film anak-anak legendaris, yaitu Petualangan Sherina dan Laskar Pelangi. Proses pengambilan gambar film ini dimulai di bulan Maret hingga pertengahan April 2018 di lebih dari 20 titik lokasi di Indonesia bersama lebih dari 20 orang aktor dan aktris serta lebih dari 100 orang kru profesional di bidangnya, yang menjadikan Kulari Ke Pantai sebagai produksi film anak-anak terbesar pada tahun 2018.",
            "Bebas adalah film Indonesia 2019 yang disutradarai Riri Riza dan diproduseri Mira Lesmana. Film ini ditayangkan pada 3 Oktober 2019. Film ini merupakan adaptasi bebas dari film Korea berjudul Sunny yang beredar pada tahun 2011. Film ini juga merupakan adaptasi ketiga setelah versi Vietnam dan Jepang, keduanya tayang pada tahun 2018."

    };

    private static int[] heroesImages = {
            R.drawable.film_kuldesak,
            R.drawable.film_petualangan_sherina,
            R.drawable.film_eliana_eliana,
            R.drawable.film_gie,
            R.drawable.film_untuk_rena,
            R.drawable.film_3_hari_untuk_selamanya,
            R.drawable.film_laskar_pelangi,
            R.drawable.film_takut,
            R.drawable.film_drupadi,
            R.drawable.film_sang_pemimpi,
            R.drawable.film_atambua_39_derajat_celsius,
            R.drawable.film_sokola_rimba,
            R.drawable.film_ada_apa_dengan_cinta_2,
            R.drawable.film_athirah,
            R.drawable.film_kulari_ke_pantai,
            R.drawable.film_bebas
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for(int position = 0; position<heroesImages.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
