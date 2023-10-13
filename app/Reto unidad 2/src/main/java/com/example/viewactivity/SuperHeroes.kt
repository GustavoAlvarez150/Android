package com.example.viewactivity

class SuperHeroes {
    companion object{
          val listSong = listOf<Song>(

              Song("Depeche Mode","Precious","https://www.google.com/search?client=firefox-b-d&sca_esv=564069708&sxsrf=AB5stBhlul3ty_zVJMuJzLooZQZOzwQn3w:1694311483259&q=perros&tbm=isch&source=lnms&sa=X&ved=2ahUKEwi4w-SQ-p6BAxW1JkQIHQvYCmEQ0pQJegQIDRAB&biw=1258&bih=931&dpr=1#imgrc=LqmChUwTROel2M", R.raw.precious),
              Song("Asking Alexandria","Alerion","https://www.google.com/search?q=alerion+askin+alexandria&tbm=isch&ved=2ahUKEwj55JzQ8Z6BAxUzKt4AHTizCSQQ2-cCegQIABAA&oq=alerion+askin+alexandria&gs_lcp=CgNpbWcQAzoECCMQJzoFCAAQgAQ6BggAEAgQHjoHCAAQGBCABDoICAAQgAQQsQM6BwgAEIoFEEM6BAgAEAM6CggAEIoFELEDEEM6CwgAEIAEELEDEIMBOgkIABAYEIAEEAo6BAgAEB46BwgAEBMQgAQ6BggAEB4QE1DHCljVOGDeO2gDcAB4AoAB1gKIAbErkgEIMy4xNi45LjKYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=UBv9ZPn8FrPU-LYPuOamoAI&bih=941&biw=1278&client=firefox-b-d#imgrc=6HLlVbIhnIoijM", R.raw.alerion),
              Song("Rammstein","Sex","https://www.google.com/search?q=sex+rammstein&tbm=isch&ved=2ahUKEwjr8IDd8Z6BAxWFKt4AHf-qAvAQ2-cCegQIABAA&oq=sex+rammstein&gs_lcp=CgNpbWcQAzoECCMQJzoICAAQsQMQgwE6CAgAEIAEELEDOgUIABCABDoLCAAQgAQQsQMQgwE6BAgAEAM6BAgAEB5QuAlYwi5g5jFoAHAAeACAAfEBiAHJFZIBBTAuOC42mAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=axv9ZKuPC4XV-LYP_9WKgA8&bih=941&biw=1278&client=firefox-b-d#imgrc=mIIXHs4EDpRODM", R.raw.sex),
              Song("ACDC","Touch Too Much","https://www.google.com/search?q=touch+too+much+ac+dc&tbm=isch&ved=2ahUKEwimi8jp8Z6BAxWAPN4AHUr9DMAQ2-cCegQIABAA&oq=touch+too+much+ac+dc&gs_lcp=CgNpbWcQAzIFCAAQgAQyBwgAEBgQgAQ6BAgjECc6CAgAEIAEELEDOgcIABCKBRBDOgQIABAeOgYIABAFEB46BggAEAgQHjoJCAAQGBCABBAKUMcVWKtVYMVcaAJwAHgAgAHiAYgB3CKSAQYwLjE4LjWYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=hRv9ZOa0H4D5-LYPyvqzgAw&bih=941&biw=1278&client=firefox-b-d#imgrc=qtbVXKuTgxdWDM",R.raw.touchtoomuch),
              Song("Megadeth","A Tout Le Monde","https://www.google.com/search?q=a+tout+le+monde&tbm=isch&ved=2ahUKEwjr9JL58Z6BAxUVEt4AHarRAxsQ2-cCegQIABAA&oq=a+tout+le+monde&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgQIABAeMgQIABAeOgQIIxAnOgcIABAYEIAEOgcIABCKBRBDOggIABCABBCxAzoECAAQA1CYEliiQGCERmgBcAB4AYAB9wOIAd4dkgEJMi44LjguNS0xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=phv9ZOuJDJWk-LYPqqOP2AE&bih=941&biw=1278&client=firefox-b-d#imgrc=Tjt5rLkfruIhaM", R.raw.atoutlemonde),
              Song("Imagine Dragons","Warriors","https://www.google.com/search?q=warriors+imagine+dragons+&tbm=isch&ved=2ahUKEwi21JGF8p6BAxX3JN4AHcLjAkcQ2-cCegQIABAA&oq=warriors+imagine+dragons+&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgQIABAeMgQIABAeMgQIABAeMgQIABAeMgQIABAeOgQIIxAnOggIABCABBCxAzoICAAQsQMQgwE6BwgAEIoFEEM6CwgAEIAEELEDEIMBOgoIABCKBRCxAxBDUKoKWJtPYP5PaAlwAHgBgAHzAYgBhjGSAQYwLjI4LjaYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=vxv9ZPb4FPfJ-LYPwseLuAQ&bih=941&biw=1278&client=firefox-b-d#imgrc=EQwJFK9QJQ2TRM", R.raw.warriors),
              Song("Kanye West","Gold Digger","https://www.google.com/search?q=gold+digger+kaneye+west+&tbm=isch&ved=2ahUKEwi63PmX8p6BAxVOEt4AHbEiBacQ2-cCegQIABAA&oq=gold+digger+kaneye+west+&gs_lcp=CgNpbWcQAzoECCMQJzoHCAAQigUQQzoICAAQgAQQsQM6BQgAEIAEOgQIABADOgoIABCKBRCxAxBDOggIABCxAxCDAToLCAAQgAQQsQMQgwE6BAgAEB46BggAEAgQHlAAWMxlYNZmaAJwAHgAgAGBAogBtSSSAQYwLjE4LjeYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=5hv9ZLrRMM6k-LYPscWUuAo&bih=941&biw=1278&client=firefox-b-d#imgrc=7bu_xwTRXlAJ_M", R.raw.golddigger),
              Song("Darly Hall & John Oates","Meneater","https://www.google.com/search?q=dearly+hall+%26+jonh+oates+meneater&tbm=isch&ved=2ahUKEwi2wvS68p6BAxVNFt4AHR6oAHIQ2-cCegQIABAA&oq=dearly+hall+%26+jonh+oates+meneater&gs_lcp=CgNpbWcQAzoECCMQJ1DLBljoFmC7GmgAcAB4AIABiwKIAacPkgEFMS40LjWYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=MBz9ZLbqBs2s-LYPntCCkAc&bih=941&biw=1278&client=firefox-b-d#imgrc=NRp-4jOsLAVVUM",R.raw.maneater),
              Song("Molotov","Money In The bank","https://www.google.com/search?q=money+in+the+dark+molotv&tbm=isch&ved=2ahUKEwjbj63A8p6BAxX8wckDHa0PBZIQ2-cCegQIABAA&oq=money+in+the+dark+molotv&gs_lcp=CgNpbWcQAzoECCMQJzoHCCMQ6gIQJzoICAAQgAQQsQM6BQgAEIAEOgsIABCABBCxAxCDAToHCAAQigUQQzoNCAAQigUQsQMQgwEQQzoECAAQAzoKCAAQigUQsQMQQzoECAAQHjoGCAAQBRAeOgYIABAIEB46BwgAEBMQgAQ6CAgAEAgQHhATOgcIABAYEIAEUJ8sWNOyAWCktAFoCnAAeAGAAYkEiAGNVJIBCzEuNDQuMTIuNS0xmAEAoAEBqgELZ3dzLXdpei1pbWewAQrAAQE&sclient=img&ei=Oxz9ZJuGIPyDp84PrZ-UkAk&bih=941&biw=1278&client=firefox-b-d#imgrc=xWkSLYvs2R-EtM", R.raw.moneyinthebank),
              Song("The doors","break On Through","https://www.google.com/search?q=break+on+through&tbm=isch&ved=2ahUKEwjLx5rT8p6BAxXwwskDHfjyDbsQ2-cCegQIABAA&oq=break+on+through&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB46BAgjECc6CAgAEIAEELEDOgsIABCABBCxAxCDAToHCAAQigUQQzoKCAAQigUQsQMQQzoECAAQAzoGCAAQBRAeOgYIABAIEB46BwgAEBgQgARQ4AtYoU9gkFFoA3AAeACAAYACiAGoHpIBBjAuMTUuNZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=Yxz9ZIuKBPCFp84P-OW32As&bih=941&biw=1278&client=firefox-b-d#imgrc=5TYlwSCL-rcbyM", R.raw.breakonthrough),
              Song("Los Fabuloso Cadilacs","Calaveras y Diablitos","https://www.google.com/search?q=calaveras+y+diablitos&tbm=isch&chips=q:calavera+y+diablitos,online_chips:fabulosos+cadillacs+calaveras:vaHJ5KOf4Ag%3D&client=firefox-b-d&hl=es&sa=X&ved=2ahUKEwjy3Jrq8p6BAxUBx8kDHeD0DyUQ4lYoAXoECAEQNw&biw=1278&bih=941#imgrc=N7ELGPU7ij9CrM", R.raw.calaverasydiablitos)

          )

        val listVideo = listOf<Video>(

            Video("Lala", "Myke Towers", R.raw.lala),
            Video("Vagabundo", "Sebastián Yatra", R.raw.vagabundo),
            Video("Tonto", "Quevedo", R.raw.tonto),
            Video("Playa", "Quevedo-Myke Tower", R.raw.playa),
            Video("Moment of you life", "Brent Faiyaz", R.raw.moment),
            Video("La bebe", "Peso pluma", R.raw.labebe),
            Video("La dolida", "Shakira & BZRP", R.raw.dolida),
            Video("Despechada", "Rosalia", R.raw.despechada),
            Video("Blindside", "James Arthur", R.raw.blindside),
            Video("Paint town to red", "Doja cat", R.raw.paint),
        )

    }
}