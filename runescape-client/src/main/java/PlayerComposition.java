import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("k")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("i")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("w")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("s")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1446763331
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 3851484461593435505L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = -8997402803958711599L
	)
	long field3021;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Ley;"
	)
	class150[] field3027;
	@ObfuscatedName("p")
	boolean field3026;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field3026 = false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([I[Ley;Z[IZII)V",
		garbageValue = "-1612430375"
	)
	public void method5062(int[] var1, class150[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field3027 = var2;
		this.field3026 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "844245890"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < class67.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = ReflectionCheck.KitDefinition_get(var6);
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1990205342"
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
							var3 = class67.KitDefinition_fileCount - 1;
						}
					} else {
						++var3;
						if (var3 >= class67.KitDefinition_fileCount) {
							var3 = 0;
						}
					}

					var4 = ReflectionCheck.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || var1 + (this.isFemale ? 7 : 0) != var4.bodypartID);

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-58"
	)
	public void method5045(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class137.field1519[var1].length - 1;
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
				if (var3 >= class137.field1519[var1].length) {
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "586785415"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update((int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "462047294"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2147251395"
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
		if (0L != var1 && this.hash != var1 || this.field3026) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lfm;ILfm;II)Lhl;",
		garbageValue = "-1279646486"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return ScriptFrame.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
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

			Model var18 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var18 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !ReflectionCheck.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !TaskHandler.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field3021 != -1L) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3021);
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
							ModelData var14 = ReflectionCheck.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = TaskHandler.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3397(this.isFemale);
							if (var15 != null) {
								if (this.field3027 != null) {
									class150 var16 = this.field3027[var12];
									if (var16 != null) {
										int var17;
										if (var16.field1598 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1598.length) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.field1598[var17]);
											}
										}

										if (var16.field1600 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1600.length) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.field1600[var17]);
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
						if (this.bodyColors[var13] < class137.field1519[var13].length) {
							var20.recolor(DesktopPlatformInfoProvider.field4081[var13], class137.field1519[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < ClanChannel.field1512[var13].length) {
							var20.recolor(Varps.field3013[var13], ClanChannel.field1512[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3021 = var5;
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "1238658700"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return ScriptFrame.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !ReflectionCheck.KitDefinition_get(var3 - 256).method3053()) {
					var1 = true;
				}

				if (var3 >= 512 && !TaskHandler.ItemDefinition_get(var3 - 512).method3342(this.isFemale)) {
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
						var6 = ReflectionCheck.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = TaskHandler.ItemDefinition_get(var5 - 512).method3409(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class137.field1519[var5].length) {
						var8.recolor(DesktopPlatformInfoProvider.field4081[var5], class137.field1519[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < ClanChannel.field1512[var5].length) {
						var8.recolor(Varps.field3013[var5], ClanChannel.field1512[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-704245622"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + ScriptFrame.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "86"
	)
	public static boolean method5067(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
