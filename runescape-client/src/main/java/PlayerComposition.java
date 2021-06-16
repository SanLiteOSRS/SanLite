import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("i")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("f")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("e")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("v")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1143886593
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 6473412202917111637L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -8931955685626883585L
	)
	long field2933;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Let;"
	)
	class136[] field2939;
	@ObfuscatedName("r")
	boolean field2942;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		Widget_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field2942 = false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([I[Let;Z[IZII)V",
		garbageValue = "196124213"
	)
	public void method4837(int[] var1, class136[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field2939 = var2;
		this.field2942 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([I[IZIB)V",
		garbageValue = "94"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < TileItem.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = class23.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == (var3 ? 7 : 0) + var5) {
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1938874220"
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
							var3 = TileItem.KitDefinition_fileCount - 1;
						}
					} else {
						++var3;
						if (var3 >= TileItem.KitDefinition_fileCount) {
							var3 = 0;
						}
					}

					var4 = class23.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || var1 + (this.isFemale ? 7 : 0) != var4.bodypartID);

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1585830935"
	)
	public void method4820(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class69.field568[var1].length - 1;
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
				if (var3 >= class69.field568[var1].length) {
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "86"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update((int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1987316978"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1503997487"
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
		if (var1 != 0L && this.hash != var1 || this.field2942) {
			Widget_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lfm;ILfm;IB)Lgd;",
		garbageValue = "16"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class248.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
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

			Model var18 = (Model)Widget_cachedModels.get(var5);
			if (var18 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !class23.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !class250.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field2933 != -1L) {
						var18 = (Model)Widget_cachedModels.get(this.field2933);
					}

					if (var18 == null) {
						return null;
					}
				}

				if (var18 == null) {
					ModelData[] var19 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						if (var13 >= 256 && var13 < 512) {
							ModelData var14 = class23.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = class250.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3070(this.isFemale);
							if (var15 != null) {
								if (this.field2939 != null) {
									class136 var16 = this.field2939[var12];
									if (var16 != null) {
										int var17;
										if (var16.field1542 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1542.length) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.field1542[var17]);
											}
										}

										if (var16.field1541 != null && var22.retextureFrom != null && var16.field1541.length == var22.retextureTo.length) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.field1541[var17]);
											}
										}
									}
								}

								var19[var11++] = var15;
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class69.field568[var13].length) {
							var20.recolor(VarcInt.field1581[var13], class69.field568[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < Skills.field3175[var13].length) {
							var20.recolor(ModelData0.field2517[var13], Skills.field3175[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					Widget_cachedModels.put(var18, var5);
					this.field2933 = var5;
				}
			}

			if (var1 == null && var3 == null) {
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) {
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) {
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4);
				}

				return var21;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lga;",
		garbageValue = "-1528210123"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class248.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !class23.KitDefinition_get(var3 - 256).method2754()) {
					var1 = true;
				}

				if (var3 >= 512 && !class250.ItemDefinition_get(var3 - 512).method3102(this.isFemale)) {
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
						var6 = class23.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = class250.ItemDefinition_get(var5 - 512).method3082(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class69.field568[var5].length) {
						var8.recolor(VarcInt.field1581[var5], class69.field568[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < Skills.field3175[var5].length) {
						var8.recolor(ModelData0.field2517[var5], Skills.field3175[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2124364299"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class248.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)V",
		garbageValue = "7586"
	)
	static final void method4850(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method3959(var17, var18, var19);
			Rasterizer3D.method3962(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method3959(var17, var19, var20);
			Rasterizer3D.method3962(var21, var23, var24, var17, var19, var20, var4);
		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Liv;B)Liv;",
		garbageValue = "-77"
	)
	static Widget method4851(Widget var0) {
		int var1 = class8.method104(class22.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = WorldMapData_1.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
