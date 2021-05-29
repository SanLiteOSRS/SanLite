import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	static class11 field1633;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2060838679
	)
	@Export("id")
	public int id;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1748856001
	)
	@Export("size")
	public int size;
	@ObfuscatedName("b")
	@Export("models")
	int[] models;
	@ObfuscatedName("d")
	int[] field1638;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1310735685
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1743545491
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1143137827
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1881319333
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2006031471
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1692683489
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1089328917
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("k")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("m")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("x")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("z")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("w")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -427478981
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1078672503
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1467757175
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("i")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2079488611
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 373531825
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1099409813
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -729878735
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ad")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -17335253
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1483491067
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ag")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ax")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("as")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-260686681"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1170104499"
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
		descriptor = "(Lnd;IB)V",
		garbageValue = "-16"
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
			this.field1638 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1638[var4] = var1.readUnsignedShort();
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
			this.contrast = var1.readByte();
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
				this.params = ModeWhere.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lfl;ILfl;II)Lgr;",
		garbageValue = "-26460885"
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

				var5 = var10.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30);
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Lgm;",
		garbageValue = "7106"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) {
			NPCComposition var7 = this.transform();
			return var7 == null ? null : var7.getModelData();
		} else if (this.field1638 == null) {
			return null;
		} else {
			boolean var1 = false;

			for (int var2 = 0; var2 < this.field1638.length; ++var2) {
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1638[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1638.length];

				for (int var3 = 0; var3 < this.field1638.length; ++var3) {
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1638[var3], 0);
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lef;",
		garbageValue = "5"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Skeleton.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? StructComposition.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1279569027"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = Skeleton.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "506916452"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return SecureRandomFuture.method1977(this.params, var1, var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-614305753"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FriendsList.method5650(this.params, var1, var2);
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-1922"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class21.getPacketBufferNode(ClientPacket.field2574, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1165253281"
	)
	static void method2791() {
		if (Client.field724 && class93.localPlayer != null) {
			int var0 = class93.localPlayer.pathX[0];
			int var1 = class93.localPlayer.pathY[0];
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
				return;
			}

			RouteStrategy.oculusOrbFocalPointX = class93.localPlayer.x;
			int var2 = class105.getTileHeight(class93.localPlayer.x, class93.localPlayer.y, class22.Client_plane) - Client.camFollowHeight;
			if (var2 < class17.field148) {
				class17.field148 = var2;
			}

			ModelData0.oculusOrbFocalPointY = class93.localPlayer.y;
			Client.field724 = false;
		}

	}
}
