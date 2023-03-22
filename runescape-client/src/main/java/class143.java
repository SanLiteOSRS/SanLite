import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class143 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -578963151
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -6594735903680955441L
	)
	long field1630;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -946279033
	)
	int field1628;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	IterableNodeDeque field1629;

	@ObfuscatedSignature(
		descriptor = "(Lsy;)V"
	)
	public class143(Buffer var1) {
		this.field1628 = -1; // L: 9
		this.field1629 = new IterableNodeDeque(); // L: 10
		this.method3125(var1); // L: 28
	} // L: 29

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-914710127"
	)
	void method3125(Buffer var1) {
		this.field1630 = var1.readLong(); // L: 32
		this.field1628 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class162(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class138(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class155(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class147(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class154(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class139(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class144(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class137(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class141(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class158(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class164(this);
			} else if (var2 == 10) {
				var3 = new class150(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class145(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class149(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class159(this);
			}

			((class140)var3).vmethod3361(var1); // L: 53
			this.field1629.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;I)V",
		garbageValue = "-535629079"
	)
	public void method3126(ClanSettings var1) {
		if (var1.field1687 == this.field1630 && this.field1628 == var1.field1709) { // L: 60
			for (class140 var2 = (class140)this.field1629.last(); var2 != null; var2 = (class140)this.field1629.previous()) { // L: 61
				var2.vmethod3362(var1); // L: 62
			}

			++var1.field1709; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1440075578"
	)
	static final int method3131() {
		if (WorldMapSectionType.clientPreferences.method2458()) { // L: 4881
			return TaskHandler.Client_plane;
		} else {
			int var0 = 3; // L: 4882
			if (class311.cameraPitch < 310) { // L: 4883
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 4886
					var1 = GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX >> 7; // L: 4887
					var2 = ReflectionCheck.oculusOrbFocalPointY >> 7; // L: 4888
				} else {
					var1 = BuddyRankComparator.localPlayer.x >> 7; // L: 4891
					var2 = BuddyRankComparator.localPlayer.y >> 7; // L: 4892
				}

				int var3 = class381.cameraX >> 7; // L: 4894
				int var4 = class471.cameraZ >> 7; // L: 4895
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 4896
					return TaskHandler.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 4897
					return TaskHandler.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) { // L: 4898
					var0 = TaskHandler.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 4900
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 4901
				}

				int var6;
				if (var2 > var4) { // L: 4903
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 4904
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 4905
					var7 = var6 * 65536 / var5; // L: 4906
					var8 = 32768; // L: 4907

					while (var1 != var3) { // L: 4908
						if (var3 < var1) { // L: 4909
							++var3;
						} else if (var3 > var1) { // L: 4910
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) { // L: 4911
							var0 = TaskHandler.Client_plane;
						}

						var8 += var7; // L: 4912
						if (var8 >= 65536) { // L: 4913
							var8 -= 65536; // L: 4914
							if (var4 < var2) { // L: 4915
								++var4;
							} else if (var4 > var2) { // L: 4916
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) { // L: 4917
								var0 = TaskHandler.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 4921
					var7 = var5 * 65536 / var6; // L: 4922
					var8 = 32768; // L: 4923

					while (var4 != var2) { // L: 4924
						if (var4 < var2) { // L: 4925
							++var4;
						} else if (var4 > var2) { // L: 4926
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) { // L: 4927
							var0 = TaskHandler.Client_plane;
						}

						var8 += var7; // L: 4928
						if (var8 >= 65536) { // L: 4929
							var8 -= 65536; // L: 4930
							if (var3 < var1) { // L: 4931
								++var3;
							} else if (var3 > var1) { // L: 4932
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) { // L: 4933
								var0 = TaskHandler.Client_plane;
							}
						}
					}
				}
			}

			if (BuddyRankComparator.localPlayer.x >= 0 && BuddyRankComparator.localPlayer.y >= 0 && BuddyRankComparator.localPlayer.x < 13312 && BuddyRankComparator.localPlayer.y < 13312) { // L: 4938
				if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][BuddyRankComparator.localPlayer.x >> 7][BuddyRankComparator.localPlayer.y >> 7] & 4) != 0) { // L: 4939
					var0 = TaskHandler.Client_plane;
				}

				return var0; // L: 4940
			} else {
				return TaskHandler.Client_plane;
			}
		}
	}
}
