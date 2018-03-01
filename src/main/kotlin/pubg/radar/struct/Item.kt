package pubg.radar.struct

class Item {
    companion object {
        // Group
        // Inner, Outer ?
        private val category = mapOf(
                "Attach" to mapOf(
                        "Weapon" to mapOf(
                                "Lower" to mapOf(
                                        "AngledForeGrip" to "A.Grip",
                                        "Foregrip" to "V.Grip"
                                ),
                                "Magazine" to mapOf(
                                        "Extended" to mapOf(
                                                "Medium" to "U.Ext",
                                                "Large" to "AR.Ext",
                                                "SniperRifle" to "S.Ext"
                                        ),
                                        "ExtendedQuickDraw" to mapOf(
                                                "Medium" to "U.ExtQ",
                                                "Large" to "AR.ExtQ",
                                                "SniperRifle" to "S.ExtQ"
                                        )
                                ),
                                "Muzzle" to mapOf(
                                        "Choke" to "Choke",
                                        "Compensator" to mapOf(
                                                "Large" to "AR.Comp"
                                                //"SniperRifle" to "S.Comp"
                                        ),
                                        "FlashHider" to mapOf(
                                                "Large" to "FH",
                                                "SniperRifle" to "FH"
                                        ),
                                        "Suppressor" to mapOf(
                                                "Medium" to "U.Supp",
                                                "Large" to "AR.Supp",
                                                "SniperRifle" to "S.Supp"
                                        )
                                ),
                                "Stock" to mapOf(
                                        "AR" to "AR.Stock",
                                        "SniperRifle" to mapOf(
                                                "BulletLoops" to "S.Loops",
                                                "CheekPad" to "CheekPad"
                                        )
                                ),
                                "Upper" to mapOf(
                                        "DotSight" to "DotSight",
                                        "Aimpoint" to "Aimpoint",
                                        "Holosight" to "Holosight",
                                        "ACOG" to "ACQG",
                                        "CQBSS" to "CQBSS"
                                )
                        )
                ),
                "Boost" to mapOf(
                        "EnergyDrink" to "Drink",
                        "PainKiller" to "Pain"
                ),
                "Heal" to mapOf(
                        "FirstAid" to "FirstAid",
                        "MedKit" to "MedKit"
                ),
                "Weapon" to mapOf(
                        "WeapM16A4" to "WeapM16A4",
                        "WeapHK416" to "WeapHK416",
                        "WeapKar98k" to "WeapKar98k",
                        "WeapSCAR" to "WeapSCAR",
                        "WeapAK47" to "WeapAK47",
                        "WeapSKS" to "WeapSKS",
                        "WeapMini14" to "WeapMini14",
                        "WeapDP28" to "WeapDP28",
                        "WeapUMP" to "WeapUMP",
                        "WeapVector" to "WeapVector",
                        "WeapPan" to "WeapPan",
                        "WeapSawnOff" to "WeapSawnOff",
                        "WeapUZI" to "WeapUZI",
                        "WeapGrenade" to "WeapGrenade",
                        "WeapSmoke" to "WeapSmoke",
                        "WeapFlash" to "WeapFlashBang",
                        "WeapMolotov" to "WeapMolotov"
                ),
                "Ammo" to mapOf(
                        "9mm" to "Item_Ammo_9mm",
                        "45mm" to "Item_Ammo_45mm",
                        "556mm" to "Item_Ammo_556mm",
                        "762mm" to "Item_Ammo_762mm",
                        "300mm" to "Item_Ammo_300mm"
                ),
                "Armor" to mapOf(
                        "C" to mapOf("01" to mapOf("Lv3" to "Arm3")),
                        "D" to mapOf("01" to mapOf("Lv2" to "Arm2"))
                ),
                "Back" to mapOf(
                        "C" to mapOf(
                                "01" to mapOf("Lv3" to "Bag3"),
                                "02" to mapOf("Lv3" to "Bag3")
                        ),
                        "F" to mapOf(
                                "01" to mapOf("Lv2" to "Bag2"),
                                "02" to mapOf("Lv2" to "Bag2")
                        )
                ),
                "Head" to mapOf(
                        "F" to mapOf(
                                "01" to mapOf("Lv2" to "Helm2"),
                                "02" to mapOf("Lv2" to "Helm2")
                        ),
                        "G" to mapOf("01" to mapOf("Lv3" to "Helm3"))
                )
        ) as Map<String, Any>

        /**
         * @return null if not good, or short name for it
         */
        fun isGood(description: String): String? {
            try {
                val start = description.indexOf("Item_")
                if (start == -1) return null//not item
                val words = description.substring(start + 5).split("_")
                var c = category
                for (word in words) {
                    if (word !in c) return null
                    val sub: Any? = c[word]
                    if (sub is String) return sub
                    c = sub as Map<String, Any>
                }
            } catch (e: Exception) {
            }
            return null
        }

    }
}