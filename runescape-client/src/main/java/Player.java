import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1565845213
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 268049119
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1372932469
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("j")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1947441591
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1658362291
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -483485189
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1390365133
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2037290909
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1452650311
	)
	int field1202;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1606153053
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2065747987
	)
	int field1220;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1119093931
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1402081485
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 482792791
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1028292805
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("x")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1597353853
	)
	@Export("team")
	int team;
	@ObfuscatedName("w")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 671262203
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -104146557
	)
	@Export("index")
	int index;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	TriBool field1217;
	@ObfuscatedName("ap")
	boolean field1218;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -40810693
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1966912699
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1217 = TriBool.TriBool_unknown;
		this.field1218 = false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "1"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		int var2 = var1.readUnsignedByte();
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var3 = -1;
		this.team = 0;
		int[] var4 = new int[12];

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.readUnsignedByte();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				var7 = var1.readUnsignedByte();
				var4[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var4[0] == 65535) {
					var3 = var1.readUnsignedShort();
					break;
				}

				if (var4[var5] >= 512) {
					var8 = class260.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var24 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= class15.field137[var6].length) {
				var7 = 0;
			}

			var24[var6] = var7;
		}

		super.idleSequence = var1.readUnsignedShort();
		if (super.idleSequence == 65535) {
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort();
		if (super.turnLeftSequence == 65535) {
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence;
		super.walkSequence = var1.readUnsignedShort();
		if (super.walkSequence == 65535) {
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) {
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort();
		if (super.walkRightSequence == 65535) {
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort();
		if (super.runSequence == 65535) {
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapSection0.loginType);
		this.clearIsFriend();
		this.clearIsInClanChat();
		this.method2147();
		if (this == class93.localPlayer) {
			RunException.field4289 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class135[] var25 = null;
		boolean var26 = false;
		if (var1.offset < var1.array.length) {
			var8 = var1.readUnsignedShort();
			var26 = (var8 >> 15 & 1) == 1;
			if (var8 > 0 && var8 != 32768) {
				var25 = new class135[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					int var10 = var8 >> 12 - var9 & 1;
					if (var10 == 1) {
						int var14 = var4[var9] - 512;
						int var15 = var1.readUnsignedByte();
						boolean var16 = (var15 & 1) != 0;
						boolean var17 = (var15 & 2) != 0;
						class135 var18 = new class135(var14);
						int var19;
						int[] var20;
						boolean var21;
						int var22;
						short var23;
						if (var16) {
							var19 = var1.readUnsignedByte();
							var20 = new int[]{var19 & 15, var19 >> 4 & 15};
							var21 = var18.field1537 != null && var20.length == var18.field1537.length;

							for (var22 = 0; var22 < 2; ++var22) {
								if (var20[var22] != 15) {
									var23 = (short)var1.readUnsignedShort();
									if (var21) {
										var18.field1537[var20[var22]] = var23;
									}
								}
							}
						}

						if (var17) {
							var19 = var1.readUnsignedByte();
							var20 = new int[]{var19 & 15, var19 >> 4 & 15};
							var21 = var18.field1538 != null && var20.length == var18.field1538.length;

							for (var22 = 0; var22 < 2; ++var22) {
								if (var20[var22] != 15) {
									var23 = (short)var1.readUnsignedShort();
									if (var21) {
										var18.field1538[var20[var22]] = var23;
									}
								}
							}
						}

						var25[var9] = var18;
					}
				}
			}
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method4704(var4, var25, var26, var24, var2 == 1, var3);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lgr;",
		garbageValue = "-76"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? LoginScreenAnimation.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : LoginScreenAnimation.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = VarcInt.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1277, 0);
						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						var4 = this.model0;
						var4.offsetBy(this.field1202 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1220 * 4096 - super.y);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						}

						var4.offsetBy(super.x - this.field1202 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1220 * 4096);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2031085482"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "112"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-574067295"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = NetSocket.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-78"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2108325676"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = WorldMapRegion.clanChat != null && WorldMapRegion.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	void method2109() {
		this.field1217 = Client.field734[0] != null && Client.field734[0].method99(this.username.getName()) != -1 ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-660230159"
	)
	void method2147() {
		this.field1217 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1964192988"
	)
	boolean method2126() {
		if (this.field1217 == TriBool.TriBool_unknown) {
			this.method2109();
		}

		return this.field1217 == TriBool.TriBool_true;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1517836125"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? StructComposition.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "2070611264"
	)
	final void method2129(int var1, int var2, byte var3) {
		if (super.sequence != -1 && LoginScreenAnimation.SequenceDefinition_get(super.sequence).field1890 == 1) {
			super.sequence = -1;
		}

		super.field1264 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					Player var4 = this;
					int var5 = super.pathX[0];
					int var6 = super.pathY[0];
					int var7 = this.transformedSize();
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
						int var8 = SoundSystem.method808(var5, var6, this.transformedSize(), class372.method6463(var1, var2), Client.collisionMaps[this.plane], true, Client.field689, Client.field851);
						if (var8 >= 1) {
							for (int var9 = 0; var9 < var8 - 1; ++var9) {
								var4.method2165(Client.field689[var9], Client.field851[var9], (byte)2);
							}
						}
					}
				}

				this.method2165(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1441238495"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1274 = 0;
		super.field1294 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIBB)V",
		garbageValue = "-30"
	)
	final void method2165(int var1, int var2, byte var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-6"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1258875415"
	)
	public static void method2166() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-169882356"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}

		return var5;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "130039632"
	)
	public static int method2128(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-201107483"
	)
	static void method2110() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1374[var0] = null;
			Players.field1373[var0] = 1;
		}

	}
}
