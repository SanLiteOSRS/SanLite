import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public final class class300 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "726344746"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110; // L: 27
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "9"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class327.method5979(); // L: 11650
		UserComparator6.method2616(); // L: 11651
		int var1 = class78.VarpDefinition_get(var0).type; // L: 11652
		if (var1 != 0) { // L: 11653
			int var2 = Varps.Varps_main[var0]; // L: 11654
			if (var1 == 1) { // L: 11655
				if (var2 == 1) { // L: 11656
					RouteStrategy.method3811(0.9D);
				}

				if (var2 == 2) { // L: 11657
					RouteStrategy.method3811(0.8D);
				}

				if (var2 == 3) { // L: 11658
					RouteStrategy.method3811(0.7D);
				}

				if (var2 == 4) { // L: 11659
					RouteStrategy.method3811(0.6D);
				}
			}

			if (var1 == 3) { // L: 11661
				if (var2 == 0) { // L: 11662
					class10.method100(255);
				}

				if (var2 == 1) { // L: 11663
					class10.method100(192);
				}

				if (var2 == 2) { // L: 11664
					class10.method100(128);
				}

				if (var2 == 3) { // L: 11665
					class10.method100(64);
				}

				if (var2 == 4) { // L: 11666
					class10.method100(0);
				}
			}

			if (var1 == 4) { // L: 11668
				if (var2 == 0) { // L: 11669
					class181.method3480(127);
				}

				if (var2 == 1) { // L: 11670
					class181.method3480(96);
				}

				if (var2 == 2) { // L: 11671
					class181.method3480(64);
				}

				if (var2 == 3) { // L: 11672
					class181.method3480(32);
				}

				if (var2 == 4) { // L: 11673
					class181.method3480(0);
				}
			}

			if (var1 == 5) { // L: 11675
				Client.field623 = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2; // L: 11676
			}

			if (var1 == 9) { // L: 11677
				Client.field635 = var2;
			}

			if (var1 == 10) { // L: 11678
				if (var2 == 0) { // L: 11679
					class132.method2838(127);
				}

				if (var2 == 1) { // L: 11680
					class132.method2838(96);
				}

				if (var2 == 2) { // L: 11681
					class132.method2838(64);
				}

				if (var2 == 3) { // L: 11682
					class132.method2838(32);
				}

				if (var2 == 4) { // L: 11683
					class132.method2838(0);
				}
			}

			if (var1 == 17) { // L: 11685
				Client.followerIndex = var2 & 65535; // L: 11686
			}

			AttackOption[] var3;
			if (var1 == 18) { // L: 11688
				var3 = new AttackOption[]{AttackOption.field1284, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1287, AttackOption.AttackOption_alwaysRightClick}; // L: 11691
				Client.playerAttackOption = (AttackOption)GameEngine.findEnumerated(var3, var2); // L: 11693
				if (Client.playerAttackOption == null) { // L: 11694
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 11696
				if (var2 == -1) { // L: 11697
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11698
				}
			}

			if (var1 == 22) { // L: 11700
				var3 = new AttackOption[]{AttackOption.field1284, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1287, AttackOption.AttackOption_alwaysRightClick}; // L: 11703
				Client.npcAttackOption = (AttackOption)GameEngine.findEnumerated(var3, var2); // L: 11705
				if (Client.npcAttackOption == null) { // L: 11706
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11708
}
