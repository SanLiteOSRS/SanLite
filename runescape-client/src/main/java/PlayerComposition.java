import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("n")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1000886071
	)
	public static int field2581;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("z")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("k")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("s")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 32109537
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 7297189778048494063L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 549450533580292223L
	)
	long field2575;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([I[IZII)V",
		garbageValue = "1005364184"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = FriendSystem.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && (var3 ? 7 : 0) + var5 == var7.bodypartID) {
						var1[equipmentIndices[var5]] = var6 + 256;
						break;
					}
				}
			}
		}

		this.equipment = var1;
		this.bodyColors = var2;
		this.isFemale = var3;
		this.npcTransformId = var4;
		this.setHash();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IZB)V",
		garbageValue = "-97"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) {
			int var3 = this.equipment[equipmentIndices[var1]];
			if (var3 != 0) {
				var3 -= 256;

				KitDefinition var4;
				do {
					if (!var2) {
						--var3;
						if (var3 < 0) {
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3;
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0;
						}
					}

					var4 = FriendSystem.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.isFemale ? 7 : 0));

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IZI)V",
		garbageValue = "-1662290602"
	)
	public void method4102(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = WorldMapSprite.field253[var1].length - 1;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		} else {
			do {
				++var3;
				if (var3 >= WorldMapSprite.field253[var1].length) {
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-1897659753"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update((int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "85946625"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[equipmentIndices[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "6"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		int var3 = this.equipment[5];
		int var4 = this.equipment[9];
		this.equipment[5] = var4;
		this.equipment[9] = var3;
		this.hash = 0L;

		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			this.hash <<= 4;
			if (this.equipment[var5] >= 256) {
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) {
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) {
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += (long)this.bodyColors[var5];
		}

		this.hash <<= 1;
		this.hash += (long)(this.isFemale ? 1 : 0);
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (var1 != 0L && var1 != this.hash) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Ljm;ILjm;IB)Ler;",
		garbageValue = "-25"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return Skeleton.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];

				for (int var15 = 0; var15 < 12; ++var15) {
					var7[var15] = this.equipment[var15];
				}

				if (var1.shield >= 0) {
					var5 += (long)(var1.shield - this.equipment[5] << 40);
					var7[5] = var1.shield;
				}

				if (var1.weapon >= 0) {
					var5 += (long)(var1.weapon - this.equipment[3] << 48);
					var7[3] = var1.weapon;
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !FriendSystem.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field2575) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field2575);
					}

					if (var8 == null) {
						return null;
					}
				}

				if (var8 == null) {
					ModelData[] var16 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						ModelData var14;
						if (var13 >= 256 && var13 < 512) {
							var14 = FriendSystem.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var16[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							var14 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var13 - 512).method4760(this.isFemale);
							if (var14 != null) {
								var16[var11++] = var14;
							}
						}
					}

					ModelData var18 = new ModelData(var16, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < WorldMapSprite.field253[var13].length) {
							var18.recolor(Calendar.field2535[var13], WorldMapSprite.field253[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < UserComparator7.field2021[var13].length) {
							var18.recolor(GrandExchangeOfferTotalQuantityComparator.field83[var13], UserComparator7.field2021[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var18.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field2575 = var5;
				}
			}

			if (var1 == null && var3 == null) {
				return var8;
			} else {
				Model var17;
				if (var1 != null && var3 != null) {
					var17 = var1.applyTransformations(var8, var2, var3, var4);
				} else if (var1 != null) {
					var17 = var1.transformActorModel(var8, var2);
				} else {
					var17 = var3.transformActorModel(var8, var4);
				}

				return var17;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)Lee;",
		garbageValue = "491299614"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return Skeleton.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !FriendSystem.KitDefinition_get(var3 - 256).method4543()) {
					var1 = true;
				}

				if (var3 >= 512 && !GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var3 - 512).method4805(this.isFemale)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var7 = new ModelData[12];
				var3 = 0;

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var6;
					if (var5 >= 256 && var5 < 512) {
						var6 = FriendSystem.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var5 - 512).method4762(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < WorldMapSprite.field253[var5].length) {
						var8.recolor(Calendar.field2535[var5], WorldMapSprite.field253[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < UserComparator7.field2021[var5].length) {
						var8.recolor(GrandExchangeOfferTotalQuantityComparator.field83[var5], UserComparator7.field2021[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-2109600157"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + Skeleton.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IB)Lil;",
		garbageValue = "19"
	)
	@Export("getParamDefinition")
	public static ParamDefinition getParamDefinition(int var0) {
		ParamDefinition var1 = (ParamDefinition)ParamDefinition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamDefinition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamDefinition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "([BIII)Ljava/lang/String;",
		garbageValue = "401735028"
	)
	static String method4116(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class299.field3676[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class299.field3676[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class299.field3676[(var6 & 15) << 2 | var7 >>> 6]).append(class299.field3676[var7 & 63]);
				} else {
					var3.append(class299.field3676[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class299.field3676[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		signature = "(IIIIIIIII)V",
		garbageValue = "1591550158"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (WorldMapSprite.loadInterface(var0)) {
			GrandExchangeOfferNameComparator.field115 = null;
			Decimator.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (GrandExchangeOfferNameComparator.field115 != null) {
				Decimator.drawInterface(GrandExchangeOfferNameComparator.field115, -1412584499, var1, var2, var3, var4, Client.field947, class219.field2547, var7);
				GrandExchangeOfferNameComparator.field115 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field882[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field882[var8] = true;
				}
			}

		}
	}
}
