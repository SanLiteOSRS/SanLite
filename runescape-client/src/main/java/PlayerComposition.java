import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("k")
	public static short[] field2559;
	@ObfuscatedName("e")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("f")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("b")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("l")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1998131209
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -3297432427762095127L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -3842356906884846791L
	)
	long field2564;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([I[IZIB)V",
		garbageValue = "124"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = WorldMapIcon_0.KitDefinition_get(var6);
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IZI)V",
		garbageValue = "2030071885"
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

					var4 = WorldMapIcon_0.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || (this.isFemale ? 7 : 0) + var1 != var4.bodypartID);

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IZI)V",
		garbageValue = "1266192115"
	)
	public void method4148(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = MouseRecorder.field628[var1].length - 1;
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
				if (var3 >= MouseRecorder.field628[var1].length) {
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "-48"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update((int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-406740524"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-993461341"
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
		signature = "(Ljg;ILjg;II)Leh;",
		garbageValue = "1516185298"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return Clock.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
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
					if (var11 >= 256 && var11 < 512 && !WorldMapIcon_0.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !AbstractWorldMapData.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field2564 != -1L) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field2564);
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
							var14 = WorldMapIcon_0.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var16[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							var14 = AbstractWorldMapData.ItemDefinition_get(var13 - 512).method4820(this.isFemale);
							if (var14 != null) {
								var16[var11++] = var14;
							}
						}
					}

					ModelData var18 = new ModelData(var16, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < MouseRecorder.field628[var13].length) {
							var18.recolor(field2559[var13], MouseRecorder.field628[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < MusicPatchPcmStream.field2516[var13].length) {
							var18.recolor(FriendLoginUpdate.field3671[var13], MusicPatchPcmStream.field2516[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var18.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field2564 = var5;
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)Len;",
		garbageValue = "-99"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return Clock.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !WorldMapIcon_0.KitDefinition_get(var3 - 256).method4620()) {
					var1 = true;
				}

				if (var3 >= 512 && !AbstractWorldMapData.ItemDefinition_get(var3 - 512).method4809(this.isFemale)) {
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
						var6 = WorldMapIcon_0.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = AbstractWorldMapData.ItemDefinition_get(var5 - 512).method4822(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < MouseRecorder.field628[var5].length) {
						var8.recolor(field2559[var5], MouseRecorder.field628[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < MusicPatchPcmStream.field2516[var5].length) {
						var8.recolor(FriendLoginUpdate.field3671[var5], MusicPatchPcmStream.field2516[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1510142127"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + Clock.getNpcDefinition(this.npcTransformId).id;
	}
}
