import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 524920995
	)
	@Export("id")
	public int id;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -382124903
	)
	@Export("size")
	public int size;
	@ObfuscatedName("r")
	@Export("models")
	int[] models;
	@ObfuscatedName("h")
	int[] field1644;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1765271701
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1898618439
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2020012415
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -941027459
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1631754867
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1695340251
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1096930091
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("x")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("q")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("s")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("p")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("c")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 880136129
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -759959591
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1143359783
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("a")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 210983141
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2083023515
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2052657801
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1072203595
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ah")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1263939441
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2131435543
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ag")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ab")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("aq")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
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
		this.idleSequence = -1;
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1067902872"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "-22"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "124"
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
			this.idleSequence = var1.readUnsignedShort();
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
		} else if (var2 == 18) {
			var1.readUnsignedShort();
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
			this.field1644 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1644[var4] = var1.readUnsignedShort();
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
				this.params = class19.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lfm;ILfm;IB)Lgd;",
		garbageValue = "1"
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

				ModelData var10;
				if (var8.length == 1) {
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length);
				}

				if (this.recolorFrom != null) {
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
					}
				}

				if (this.retextureFrom != null) {
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var5, (long)this.id);
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) {
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lga;",
		garbageValue = "936474541"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) {
			NPCComposition var7 = this.transform();
			return var7 == null ? null : var7.getModelData();
		} else if (this.field1644 == null) {
			return null;
		} else {
			boolean var1 = false;

			for (int var2 = 0; var2 < this.field1644.length; ++var2) {
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1644[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1644.length];

				for (int var3 = 0; var3 < this.field1644.length; ++var3) {
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1644[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0];
				} else {
					var6 = new ModelData(var5, var5.length);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				return var6;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lev;",
		garbageValue = "1438500977"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = ScriptFrame.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class248.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-263969679"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = ScriptFrame.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "121544801"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2089556399"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapElement.method2742(this.params, var1, var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljp;Ljp;I)V",
		garbageValue = "1926659100"
	)
	public static void method2868(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		AttackOption.Widget_archive = var0;
		class375.Widget_modelsArchive = var1;
		class44.Widget_spritesArchive = var2;
		ChatChannel.Widget_fontsArchive = var3;
		GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents = new Widget[AttackOption.Widget_archive.getGroupCount()][];
		Widget.Widget_loadedInterfaces = new boolean[AttackOption.Widget_archive.getGroupCount()];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "4"
	)
	public static int method2841(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-355441861"
	)
	static int method2857(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			ChatChannel.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			ChatChannel.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			ChatChannel.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			ChatChannel.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				ChatChannel.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
						break;
					default:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				ChatChannel.Interpreter_intStackSize -= 3;
				long var9 = (long)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				long var11 = (long)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				long var13 = (long)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11);
				return 1;
			} else if (var0 == 4025) {
				var3 = class269.method4992(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == 4026) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == 4027) {
				ChatChannel.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapLabel.method3714(var3, var4, var5);
				return 1;
			} else if (var0 == 4028) {
				ChatChannel.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = AbstractWorldMapIcon.method3785(var3, var4, var5);
				return 1;
			} else if (var0 == 4029) {
				ChatChannel.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				ChatChannel.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3];
				var3 = AbstractWorldMapIcon.method3785(var3, var5, var6);
				var7 = UserComparator2.method6890(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-5"
	)
	static final void method2882(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class4.clientPreferences.areaSoundEffectsVolume = var0;
		Actor.savePreferences();
	}
}
