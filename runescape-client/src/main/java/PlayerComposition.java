import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("b")
	public static short[] field2934;
	@ObfuscatedName("x")
	public static short[][] field2937;
	@ObfuscatedName("k")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("h")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("c")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("o")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1194891169
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 7307112333201899495L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -595121387593760273L
	)
	long field2939;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lea;"
	)
	class135[] field2940;
	@ObfuscatedName("v")
	boolean field2941;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		Widget_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field2941 = false;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([I[Lea;Z[IZII)V",
		garbageValue = "-1769828325"
	)
	public void method4614(int[] var1, class135[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field2940 = var2;
		this.field2941 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "-1074584976"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = class161.KitDefinition_get(var6);
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "566513351"
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

					var4 = class161.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || var1 + (this.isFemale ? 7 : 0) != var4.bodypartID);

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "38"
	)
	public void method4617(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = Canvas.field295[var1].length - 1;
				}
			} while(!class3.method47(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= Canvas.field295[var1].length) {
					var3 = 0;
				}
			} while(!class3.method47(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2012874758"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update((int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "808906560"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "56371147"
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
		if (var1 != 0L && this.hash != var1 || this.field2941) {
			Widget_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lfb;ILfb;II)Lgj;",
		garbageValue = "-1140620498"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class8.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
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
					if (var11 >= 256 && var11 < 512 && !class161.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !Strings.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field2939 != -1L) {
						var18 = (Model)Widget_cachedModels.get(this.field2939);
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
							ModelData var14 = class161.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = Strings.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3026(this.isFemale);
							if (var15 != null) {
								if (this.field2940 != null) {
									class135 var16 = this.field2940[var12];
									if (var16 != null) {
										int var17;
										if (var16.field1527 != null) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.field1527[var17]);
											}
										}

										if (var16.field1531 != null) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.field1531[var17]);
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
						if (this.bodyColors[var13] < Canvas.field295[var13].length) {
							var20.recolor(field2934[var13], Canvas.field295[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field2937[var13].length) {
							var20.recolor(Script.field1064[var13], field2937[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					Widget_cachedModels.put(var18, var5);
					this.field2939 = var5;
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "2145084703"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class8.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !class161.KitDefinition_get(var3 - 256).method2673()) {
					var1 = true;
				}

				if (var3 >= 512 && !Strings.ItemDefinition_get(var3 - 512).method2959(this.isFemale)) {
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
						var6 = class161.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = Strings.ItemDefinition_get(var5 - 512).method2950(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < Canvas.field295[var5].length) {
						var8.recolor(field2934[var5], Canvas.field295[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field2937[var5].length) {
						var8.recolor(Script.field1064[var5], field2937[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1404988967"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class8.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1444810231"
	)
	static int method4640(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}
}
