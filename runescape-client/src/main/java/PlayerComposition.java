import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("k")
	public static short[] field2601;
	@ObfuscatedName("n")
	public static short[][] field2596;
	@ObfuscatedName("l")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("f")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("o")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("u")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1124941233
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -9046432818636348341L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -3040880622035732721L
	)
	long field2600;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([I[IZII)V",
		garbageValue = "-1757144268"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = SpriteMask.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 ? 7 : 0)) {
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
		signature = "(IZB)V",
		garbageValue = "-86"
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

					var4 = SpriteMask.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.isFemale ? 7 : 0) + var1);

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IZI)V",
		garbageValue = "108911198"
	)
	public void method4205(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = ChatChannel.field1086[var1].length - 1;
				}
			} while(!TriBool.method5817(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= ChatChannel.field1086[var1].length) {
					var3 = 0;
				}
			} while(!TriBool.method5817(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "280516890"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update((int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "1914698329"
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
		signature = "(I)V",
		garbageValue = "-2039912675"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkw;ILkw;II)Lgv;",
		garbageValue = "2136869602"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return GraphicsObject.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
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
					if (var11 >= 256 && var11 < 512 && !SpriteMask.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !class23.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field2600 != -1L) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field2600);
					}

					if (var8 == null) {
						return null;
					}
				}

				if (var8 == null) {
					ModelData[] var17 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						ModelData var14;
						if (var13 >= 256 && var13 < 512) {
							var14 = SpriteMask.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var17[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							var14 = class23.ItemDefinition_get(var13 - 512).method5280(this.isFemale);
							if (var14 != null) {
								var17[var11++] = var14;
							}
						}
					}

					ModelData var18 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < ChatChannel.field1086[var13].length) {
							var18.recolor(field2601[var13], ChatChannel.field1086[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field2596[var13].length) {
							var18.recolor(WorldMapSection1.field1753[var13], field2596[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var18.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field2600 = var5;
				}
			}

			if (var1 == null && var3 == null) {
				return var8;
			} else {
				Model var16;
				if (var1 != null && var3 != null) {
					var16 = var1.applyTransformations(var8, var2, var3, var4);
				} else if (var1 != null) {
					var16 = var1.transformActorModel(var8, var2);
				} else {
					var16 = var3.transformActorModel(var8, var4);
				}

				return var16;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Lfs;",
		garbageValue = "-2099433668"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return GraphicsObject.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !SpriteMask.KitDefinition_get(var3 - 256).method4950()) {
					var1 = true;
				}

				if (var3 >= 512 && !class23.ItemDefinition_get(var3 - 512).method5237(this.isFemale)) {
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
						var6 = SpriteMask.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = class23.ItemDefinition_get(var5 - 512).method5238(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < ChatChannel.field1086[var5].length) {
						var8.recolor(field2601[var5], ChatChannel.field1086[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field2596[var5].length) {
						var8.recolor(WorldMapSection1.field1753[var5], field2596[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "1"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + GraphicsObject.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1122535637"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class15.loadInterface(var0)) {
			Widget[] var1 = Widget.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
