package com.example.clothesshop.data




import com.example.clothesshop.R
import com.example.clothesshop.data.model.Category
import com.example.clothesshop.data.model.Clothes

class Datasource {

    fun getClothes(): List<Category>{
        return listOf(
            Category(
                "Jeans",
                listOf(
                    Clothes(
                        "Jeans Brave",
                        R.drawable.jeans1,
                        3.6,
                        49.90
                    ),
                    Clothes(
                        "Jeans Crove",
                        R.drawable.jeans2,
                        4.2,
                        39.90
                    ),
                    Clothes(
                        "Jeans Ruby",
                        R.drawable.jeans3,
                        5.8,
                        79.90
                    )
                )
            ),
            Category(
                "Pullover",
                listOf(
                    Clothes(
                        "Pullover Greeny",
                        R.drawable.pullover1,
                        5.4,
                        25.90
                    ),
                    Clothes(
                        "Pullover Whity",
                        R.drawable.pullover2,
                        7.1,
                        55.90
                    ),
                    Clothes(
                        "Pullover Bluey",
                        R.drawable.pullover3,
                        6.7,
                        48.90
                    )
                )
            ),
            Category(
                "Schuhe",
                listOf(
                    Clothes(
                        "Sneakers yellow",
                        R.drawable.schuhe1,
                        6.3,
                        69.90
                    ),
                    Clothes(
                        "Sneakers blacky",
                        R.drawable.schuhe2,
                        4.6,
                        79.90
                    ),
                    Clothes(
                        "Sneakers old",
                        R.drawable.schuhe3,
                        7.2,
                        99.90
                    )
                )
            )

        )

    }
}
/*listOf(
    Clothes("Jeans Crove", R.drawable.jeans2, 4.2, 39.90)))
Category("Jeans", listOf(Clothes("Jeans Ruby", R.drawable.jeans3, 5.8, 79.90))),

Category("Pullover", listOf(Clothes("Pullover Greeny", R.drawable.pullover1, 5.4, 25.90)))
Category("Pullover", listOf(Clothes("Pullover Whity", R.drawable.pullover2, 7.1, 55.90)))
Category("Pullover", listOf(Clothes("Pullover Bluey", R.drawable.pullover3, 6.7, 48.90))),

Category("Schuhe", listOf(Clothes("Sneakers yellow", R.drawable.schuhe1, 6.3, 69.90)))
Category("Schuhe", listOf(Clothes("Sneakers blacky", R.drawable.schuhe2, 4.6, 79.90)))
Category("Schuhe", listOf(Clothes("Sneakers old", R.drawable.schuhe3, 7.2, 99.90)))*/