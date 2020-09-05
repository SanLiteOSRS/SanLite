import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -851756363
	)
	@Export("id")
	public int id;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1762851059
	)
	@Export("size")
	public int size;
	@ObfuscatedName("w")
	@Export("models")
	int[] models;
	@ObfuscatedName("g")
	int[] field3492;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 594093455
	)
	@Export("readySequence")
	public int readySequence;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1970335799
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 136881499
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1497603669
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1405079749
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -950124131
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1378189657
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("f")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("y")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("v")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("j")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("r")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("u")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -442899961
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -337235261
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -541213457
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("e")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -888518163
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -405765695
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1421208063
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 754705433
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("an")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1534025905
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1959008785
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("au")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("aa")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("ar")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "Llq;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = 1;
		this.readySequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.headIconPrayer = -1;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1451445441"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "289970781"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lkf;II)V",
		garbageValue = "-1568291099"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.readySequence = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field3492 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3492[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) {
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) {
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) {
			if (var2 == 107) {
				this.isInteractable = false;
			} else if (var2 == 109) {
				this.isClickable = false;
			} else if (var2 == 111) {
				this.isFollower = true;
			} else if (var2 == 249) {
				this.params = PacketWriter.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			var3 = -1;
			if (var2 == 118) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ljm;ILjm;IB)Ler;",
		garbageValue = "112"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) {
			NPCComposition var12 = this.transform();
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4);
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id);
			if (var5 == null) {
				boolean var6 = false;

				for (int var7 = 0; var7 < this.models.length; ++var7) {
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) {
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length];

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) {
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var11;
				if (var8.length == 1) {
					var11 = var8[0];
				} else {
					var11 = new ModelData(var8, var8.length);
				}

				if (this.recolorFrom != null) {
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
						var11.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
					}
				}

				if (this.retextureFrom != null) {
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
						var11.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
					}
				}

				var5 = var11.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var5, (long)this.id);
			}

			Model var10;
			if (var1 != null && var3 != null) {
				var10 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) {
				var10 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) {
				var10 = var3.transformActorModel(var5, var4);
			} else {
				var10 = var5.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var10.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var10;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Lee;",
		garbageValue = "1421247419"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) {
			NPCComposition var1 = this.transform();
			return var1 == null ? null : var1.getModelData();
		} else if (this.field3492 == null) {
			return null;
		} else {
			boolean var5 = false;

			for (int var2 = 0; var2 < this.field3492.length; ++var2) {
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field3492[var2], 0)) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			} else {
				ModelData[] var6 = new ModelData[this.field3492.length];

				for (int var3 = 0; var3 < this.field3492.length; ++var3) {
					var6[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field3492[var3], 0);
				}

				ModelData var7;
				if (var6.length == 1) {
					var7 = var6[0];
				} else {
					var7 = new ModelData(var6, var6.length);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var7.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var7.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)Ljx;",
		garbageValue = "795812200"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = WorldMapSection1.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Skeleton.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "140148621"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = WorldMapSection1.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1359705510"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Username.method5309(this.params, var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "77"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}
}
