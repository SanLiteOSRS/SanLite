import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cs")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 1743715259
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	static Widget field1192;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llw;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -977719887
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -408127355
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("e")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1388157533
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1578238861
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1337282737
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1410786421
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1885617879
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -269548317
	)
	int field1175;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1894921585
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1189884347
	)
	int field1177;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lgv;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 233121641
	)
	int field1187;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -14411627
	)
	int field1179;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -875595153
	)
	int field1180;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 602004441
	)
	int field1176;
	@ObfuscatedName("x")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1987166721
	)
	@Export("team")
	int team;
	@ObfuscatedName("i")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -500648257
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 797660319
	)
	@Export("index")
	int index;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ac")
	boolean field1189;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1160349387
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2033773215
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
		this.field1189 = false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;B)V",
		garbageValue = "20"
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
					int var8 = class23.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var9 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= ChatChannel.field1086[var6].length) {
				var7 = 0;
			}

			var9[var6] = var7;
		}

		super.readySequence = var1.readUnsignedShort();
		if (super.readySequence == 65535) {
			super.readySequence = -1;
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), AbstractUserComparator.loginType);
		this.clearIsFriend();
		this.clearIsInClanChat();
		if (this == Varcs.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.update(var4, var9, var2 == 1, var3);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Lgv;",
		garbageValue = "1835906978"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class225.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.readySequence == super.movementSequence && var1 != null ? null : class225.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = Varps.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1238, 0);
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
						var4.offsetBy(this.field1175 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1177 * 4096 - super.y);
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

						var4.offsetBy(super.x - this.field1175 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1177 * 4096);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(S)Z",
		garbageValue = "-13206"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-799905621"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2126620163"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class13.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1666089616"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1597100975"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-790736304"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = InterfaceParent.clanChat != null && InterfaceParent.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1864035459"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? GraphicsObject.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIBI)V",
		garbageValue = "1419129901"
	)
	final void method2120(int var1, int var2, byte var3) {
		if (super.sequence != -1 && class225.SequenceDefinition_get(super.sequence).field3723 == 1) {
			super.sequence = -1;
		}

		super.field1237 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					DevicePcmPlayerProvider.method470(this, var1, var2, (byte)2);
				}

				this.method2142(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1191185889"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1224 = 0;
		super.field1267 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(IIBI)V",
		garbageValue = "1951772159"
	)
	final void method2142(int var1, int var2, byte var3) {
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-3"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-726167195"
	)
	static int method2140(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? FriendSystem.field905 : class4.field35;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class223.method4231(DirectByteArrayCopier.getWidgetClickMask(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1281921833"
	)
	static final int method2148(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "-73"
	)
	static final boolean method2150(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		signature = "(IIIB)Lcv;",
		garbageValue = "55"
	)
	static final InterfaceParent method2151(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		PlayerComposition.Widget_resetModelFrames(var1);
		Widget var4 = class139.getWidget(var0);
		class29.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class29.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		AbstractWorldMapIcon.method3186();
		NameableContainer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		AbstractSocket.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			class379.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
