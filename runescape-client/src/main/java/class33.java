import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
public class class33 {
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1958669353
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1162709731
	)
	int field191;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 234892017
	)
	int field192;

	class33(int var1, int var2) {
		this.field191 = var1; // L: 14
		this.field192 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lbe;I)Z",
		garbageValue = "2098097689"
	)
	boolean method499(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field191) { // L: 20
			case 1:
				return var1.vmethod4207(this.field192);
			case 2:
				return var1.vmethod4217(this.field192);
			case 3:
				return var1.vmethod4234((char)this.field192); // L: 24
			case 4:
				return var1.vmethod4224(this.field192 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)[Llf;",
		garbageValue = "0"
	)
	static LoginPacket[] method504() {
		return new LoginPacket[]{LoginPacket.field3341, LoginPacket.field3343, LoginPacket.field3339, LoginPacket.field3342, LoginPacket.field3344, LoginPacket.field3338}; // L: 22
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;I)Z",
		garbageValue = "2112098628"
	)
	public static boolean method509(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1; // L: 44
		if (!var0.isFullyLoaded()) { // L: 45
			return false; // L: 46
		} else {
			class328.WorldMapElement_count = var0.getGroupFileCount(35); // L: 48
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[class328.WorldMapElement_count]; // L: 49

			for (int var2 = 0; var2 < class328.WorldMapElement_count; ++var2) { // L: 50
				byte[] var3 = var0.takeFile(35, var2); // L: 51
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2); // L: 52
				if (var3 != null) { // L: 53
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3)); // L: 54
					WorldMapElement.WorldMapElement_cached[var2].method3659(); // L: 55
				}
			}

			return true; // L: 58
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "367699395"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 27
			var1 = new ParamComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "-101"
	)
	static int method511(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 422
			return LoginScreenAnimation.method2440(var0, var1, var2);
		} else if (var0 < 1100) { // L: 423
			return class131.method3129(var0, var1, var2);
		} else if (var0 < 1200) { // L: 424
			return class31.method474(var0, var1, var2);
		} else if (var0 < 1300) { // L: 425
			return Varcs.method2755(var0, var1, var2);
		} else if (var0 < 1400) { // L: 426
			return StructComposition.method3939(var0, var1, var2);
		} else if (var0 < 1500) { // L: 427
			return class121.method2977(var0, var1, var2);
		} else if (var0 < 1600) { // L: 428
			return class244.method5043(var0, var1, var2);
		} else if (var0 < 1700) { // L: 429
			return AbstractUserComparator.method7860(var0, var1, var2);
		} else if (var0 < 1800) { // L: 430
			return DefaultsGroup.method8080(var0, var1, var2);
		} else if (var0 < 1900) { // L: 431
			return Rasterizer3D.method4451(var0, var1, var2);
		} else if (var0 < 2000) { // L: 432
			return class13.method175(var0, var1, var2);
		} else if (var0 < 2100) { // L: 433
			return class131.method3129(var0, var1, var2);
		} else if (var0 < 2200) { // L: 434
			return class31.method474(var0, var1, var2);
		} else if (var0 < 2300) { // L: 435
			return Varcs.method2755(var0, var1, var2);
		} else if (var0 < 2400) { // L: 436
			return StructComposition.method3939(var0, var1, var2);
		} else if (var0 < 2500) { // L: 437
			return class121.method2977(var0, var1, var2);
		} else if (var0 < 2600) { // L: 438
			return class31.method471(var0, var1, var2);
		} else if (var0 < 2700) { // L: 439
			return MouseHandler.method713(var0, var1, var2);
		} else if (var0 < 2800) { // L: 440
			return SceneTilePaint.method4910(var0, var1, var2);
		} else if (var0 < 2900) { // L: 441
			return method506(var0, var1, var2);
		} else if (var0 < 3000) { // L: 442
			return class13.method175(var0, var1, var2);
		} else if (var0 < 3200) { // L: 443
			return NetFileRequest.method6685(var0, var1, var2);
		} else if (var0 < 3300) { // L: 444
			return ObjectComposition.method3999(var0, var1, var2);
		} else if (var0 < 3400) { // L: 445
			return class130.method3127(var0, var1, var2);
		} else if (var0 < 3500) { // L: 446
			return class380.method7398(var0, var1, var2);
		} else if (var0 < 3600) { // L: 447
			return HitSplatDefinition.method3977(var0, var1, var2);
		} else if (var0 < 3700) { // L: 448
			return WorldMapAreaData.method5566(var0, var1, var2);
		} else if (var0 < 3800) { // L: 449
			return FloorOverlayDefinition.method4123(var0, var1, var2);
		} else if (var0 < 3900) { // L: 450
			return class478.method8902(var0, var1, var2);
		} else if (var0 < 4000) { // L: 451
			return class18.method272(var0, var1, var2);
		} else if (var0 < 4100) { // L: 452
			return UserComparator3.method2930(var0, var1, var2);
		} else if (var0 < 4200) {
			return ApproximateRouteStrategy.method1212(var0, var1, var2); // L: 453
		} else if (var0 < 4300) { // L: 454
			return MusicPatchPcmStream.method5944(var0, var1, var2);
		} else if (var0 < 5100) { // L: 455
			return UserComparator6.method2963(var0, var1, var2);
		} else if (var0 < 5400) { // L: 456
			return UserComparator4.method2878(var0, var1, var2);
		} else if (var0 < 5600) { // L: 457
			return TaskHandler.method3561(var0, var1, var2);
		} else if (var0 < 5700) { // L: 458
			return Client.method1233(var0, var1, var2);
		} else if (var0 < 6300) { // L: 459
			return class327.method6575(var0, var1, var2);
		} else if (var0 < 6600) { // L: 460
			return WorldMapArea.method5161(var0, var1, var2);
		} else if (var0 < 6700) { // L: 461
			return MouseRecorder.method2268(var0, var1, var2);
		} else if (var0 < 6800) { // L: 462
			return class282.method5682(var0, var1, var2);
		} else if (var0 < 6900) { // L: 463
			return NetFileRequest.method6686(var0, var1, var2);
		} else if (var0 < 7000) { // L: 464
			return UserComparator7.method2911(var0, var1, var2);
		} else if (var0 < 7100) { // L: 465
			return SoundSystem.method879(var0, var1, var2);
		} else if (var0 < 7200) { // L: 466
			return class163.method3463(var0, var1, var2);
		} else if (var0 < 7300) { // L: 467
			return class16.method215(var0, var1, var2);
		} else if (var0 < 7500) { // L: 468
			return class126.method3099(var0, var1, var2);
		} else if (var0 < 7600) { // L: 469
			return class144.method3251(var0, var1, var2);
		} else {
			return var0 < 7700 ? FriendSystem.method1890(var0, var1, var2) : 2; // L: 470 471
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1290821012"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 212
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 213
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 214
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE; // L: 215
		} else if (var0.equals("Z")) { // L: 216
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 217
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 218
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE; // L: 219
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 220 221
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BB)Lch;",
		garbageValue = "1"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 108
		Buffer var2 = new Buffer(var0); // L: 109
		var2.offset = var2.array.length - 2; // L: 110
		int var3 = var2.readUnsignedShort(); // L: 111
		int var4 = var2.array.length - 2 - var3 - 12; // L: 112
		var2.offset = var4; // L: 113
		int var5 = var2.readInt(); // L: 114
		var1.localIntCount = var2.readUnsignedShort(); // L: 115
		var1.localStringCount = var2.readUnsignedShort(); // L: 116
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 117
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 118
		int var6 = var2.readUnsignedByte(); // L: 119
		int var7;
		int var8;
		if (var6 > 0) { // L: 120
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 121

			for (var7 = 0; var7 < var6; ++var7) { // L: 122
				var8 = var2.readUnsignedShort(); // L: 123
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class70.method2044(var8) : 1); // L: 124
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt(); // L: 127
					int var11 = var2.readInt(); // L: 128
					var9.put(new IntegerNode(var11), (long)var10); // L: 129
				}
			}
		}

		var2.offset = 0; // L: 133
		var1.field961 = var2.readStringCp1252NullTerminatedOrNull(); // L: 134
		var1.opcodes = new int[var5]; // L: 135
		var1.intOperands = new int[var5]; // L: 136
		var1.stringOperands = new String[var5]; // L: 137

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 138 139 144
			var8 = var2.readUnsignedShort(); // L: 140
			if (var8 == 3) { // L: 141
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) { // L: 142
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 143
			}
		}

		return var1; // L: 146
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2064360869"
	)
	static final void method502() {
		VerticalAlignment.method3825("You can't add yourself to your own friend list"); // L: 125
	} // L: 126

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbm;I)V",
		garbageValue = "626811319"
	)
	static void method510(GameEngine var0) {
		class207 var1 = Client.field721; // L: 2085
		class207 var2 = var1; // L: 2087

		while (var2.method4215()) { // L: 2088
			if (var2.field2362 == 13) { // L: 2089
				class138.method3210(); // L: 2090
				return; // L: 2091
			}

			if (var2.field2362 == 96) { // L: 2093
				if (Login.worldSelectPage > 0 && PlayerType.worldSelectLeftSprite != null) { // L: 2094
					--Login.worldSelectPage; // L: 2095
				}
			} else if (var2.field2362 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class13.worldSelectRightSprite != null) { // L: 2098 2099
				++Login.worldSelectPage; // L: 2100
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 2104
			int var3 = Login.xPadding + 280; // L: 2105
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2106
				class500.changeWorldSelectSorting(0, 0); // L: 2107
				return; // L: 2108
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2110
				class500.changeWorldSelectSorting(0, 1); // L: 2111
				return; // L: 2112
			}

			int var4 = Login.xPadding + 390; // L: 2114
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2115
				class500.changeWorldSelectSorting(1, 0); // L: 2116
				return; // L: 2117
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2119
				class500.changeWorldSelectSorting(1, 1); // L: 2120
				return; // L: 2121
			}

			int var5 = Login.xPadding + 500; // L: 2123
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2124
				class500.changeWorldSelectSorting(2, 0); // L: 2125
				return; // L: 2126
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2128
				class500.changeWorldSelectSorting(2, 1); // L: 2129
				return; // L: 2130
			}

			int var6 = Login.xPadding + 610; // L: 2132
			if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2133
				class500.changeWorldSelectSorting(3, 0); // L: 2134
				return; // L: 2135
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2137
				class500.changeWorldSelectSorting(3, 1); // L: 2138
				return; // L: 2139
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 2141
				class138.method3210(); // L: 2142
				return; // L: 2143
			}

			if (Login.hoveredWorldIndex != -1) { // L: 2145
				World var7 = class31.World_worlds[Login.hoveredWorldIndex]; // L: 2146
				FloorOverlayDefinition.changeWorld(var7); // L: 2147
				class138.method3210(); // L: 2148
				return; // L: 2149
			}

			if (Login.worldSelectPage > 0 && PlayerType.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= PlayerType.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class262.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class262.canvasHeight / 2 + 50) { // L: 2151
				--Login.worldSelectPage; // L: 2152
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class13.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class13.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class262.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class262.canvasHeight / 2 + 50) { // L: 2154
				++Login.worldSelectPage; // L: 2155
			}
		}

	} // L: 2158

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "-328074717"
	)
	static int method506(int var0, Script var1, boolean var2) {
		Widget var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1853
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1854
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class195.Widget_unpackTargetMask(class25.getWidgetFlags(var3)); // L: 1855
			return 1; // L: 1856
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1858
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1865
				if (var3.dataText == null) { // L: 1866
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1867
				}

				return 1; // L: 1868
			} else {
				return 2; // L: 1870
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1859
			--var4; // L: 1860
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1861
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1862
			} else {
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1863
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIII)V",
		garbageValue = "1538298261"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5002
			if (var0 instanceof NPC) { // L: 5003
				NPCComposition var6 = ((NPC)var0).definition; // L: 5004
				if (var6.transforms != null) { // L: 5005
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5006
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5008
			int[] var7 = Players.Players_indices; // L: 5009
			boolean var8 = var1 < var75; // L: 5010
			int var9 = -2; // L: 5011
			int var10;
			if (var0.field1148 != null && (!var8 || !var0.field1144 && (Client.publicChatMode == 4 || !var0.field1176 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5012 5013
				var10 = var0.defaultHeight; // L: 5014
				class374.worldToScreen(var0.x, var0.y, var10); // L: 5016
				if (Client.viewportTempX > -1 && Client.field589 < Client.field590) { // L: 5018
					Client.field607[Client.field589] = class137.fontBold12.stringWidth(var0.field1148) / 2; // L: 5019
					Client.field593[Client.field589] = class137.fontBold12.ascent; // L: 5020
					Client.field591[Client.field589] = Client.viewportTempX; // L: 5021
					Client.field592[Client.field589] = Client.viewportTempY - var9; // L: 5022
					Client.field586[Client.field589] = var0.field1161; // L: 5023
					Client.field596[Client.field589] = var0.field1206; // L: 5024
					Client.field566[Client.field589] = var0.field1160; // L: 5025
					Client.field598[Client.field589] = var0.field1148; // L: 5026
					++Client.field589; // L: 5027
					var9 += 12; // L: 5028
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7012()) { // L: 5032
				UserComparator6.method2972(var0, var0.defaultHeight + 15); // L: 5033

				for (HealthBar var76 = (HealthBar)var0.healthBars.last(); var76 != null; var76 = (HealthBar)var0.healthBars.previous()) { // L: 5034
					HealthBarUpdate var77 = var76.getInventorySprite(Client.cycle); // L: 5035
					if (var77 == null) { // L: 5036
						if (var76.isEmpty()) { // L: 5094
							var76.remove();
						}
					} else {
						HealthBarDefinition var12 = var76.definition; // L: 5037
						SpritePixels var79 = var12.method3713(); // L: 5038
						SpritePixels var83 = var12.method3714(); // L: 5039
						int var84 = 0; // L: 5041
						if (var79 != null && var83 != null) { // L: 5042
							if (var12.widthPadding * 2 < var83.subWidth) { // L: 5043
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5044
						} else {
							var15 = var12.width; // L: 5046
						}

						int var81 = 255; // L: 5047
						boolean var85 = true; // L: 5048
						int var86 = Client.cycle - var77.cycle; // L: 5049
						int var87 = var15 * var77.health2 / var12.width; // L: 5050
						int var88;
						int var98;
						if (var77.cycleOffset > var86) { // L: 5051
							var88 = var12.field1971 == 0 ? 0 : var12.field1971 * (var86 / var12.field1971); // L: 5052
							var22 = var15 * var77.health / var12.width; // L: 5053
							var98 = var88 * (var87 - var22) / var77.cycleOffset + var22; // L: 5054
						} else {
							var98 = var87; // L: 5057
							var88 = var12.int5 + var77.cycleOffset - var86; // L: 5058
							if (var12.int3 >= 0) { // L: 5059
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var77.health2 > 0 && var98 < 1) { // L: 5061
							var98 = 1;
						}

						if (var79 != null && var83 != null) { // L: 5062
							if (var15 == var98) { // L: 5063
								var98 += var84 * 2;
							} else {
								var98 += var84; // L: 5064
							}

							var88 = var79.subHeight; // L: 5065
							var9 += var88; // L: 5066
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5067
							var23 = var3 + Client.viewportTempY - var9; // L: 5068
							var22 -= var84; // L: 5069
							if (var81 >= 0 && var81 < 255) { // L: 5070
								var79.drawTransAt(var22, var23, var81); // L: 5071
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88); // L: 5072
								var83.drawTransAt(var22, var23, var81); // L: 5073
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5076
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var88); // L: 5077
								var83.drawTransBgAt(var22, var23); // L: 5078
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5080
							var9 += 2; // L: 5081
						} else {
							var9 += 5; // L: 5084
							if (Client.viewportTempX > -1) { // L: 5085
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5086
								var22 = var3 + Client.viewportTempY - var9; // L: 5087
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280); // L: 5088
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var98, var22, var15 - var98, 5, 16711680); // L: 5089
							}

							var9 += 2; // L: 5091
						}
					}
				}
			}

			if (var9 == -2) { // L: 5097
				var9 += 7;
			}

			int var11;
			Player var93;
			if (var8 && var0.playerCycle == Client.cycle && class13.method172((Player)var0)) { // L: 5098
				var93 = (Player)var0; // L: 5099
				if (var8) { // L: 5100
					var11 = var0.defaultHeight + 15; // L: 5101
					class374.worldToScreen(var0.x, var0.y, var11); // L: 5103
					AbstractFont var89 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 5105
					var9 += 4; // L: 5106
					var89.drawCentered(var93.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5107
					var9 += 18; // L: 5108
				}
			}

			if (var8) { // L: 5111
				var93 = (Player)var0; // L: 5112
				if (var93.isHidden) { // L: 5113
					return;
				}

				if (var93.headIconPk != -1 || var93.headIconPrayer != -1) { // L: 5114
					var11 = var0.defaultHeight + 15; // L: 5115
					class374.worldToScreen(var0.x, var0.y, var11); // L: 5117
					if (Client.viewportTempX > -1) { // L: 5119
						if (var93.headIconPk != -1) { // L: 5120
							var9 += 25; // L: 5121
							class36.headIconPkSprites[var93.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5122
						}

						if (var93.headIconPrayer != -1) { // L: 5124
							var9 += 25; // L: 5125
							class425.headIconPrayerSprites[var93.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5126
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5130
					var11 = var0.defaultHeight + 15; // L: 5131
					class374.worldToScreen(var0.x, var0.y, var11); // L: 5133
					if (Client.viewportTempX > -1) { // L: 5135
						var9 += KitDefinition.headIconHintSprites[1].subHeight; // L: 5136
						KitDefinition.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5137
					}
				}
			} else {
				NPC var94 = (NPC)var0; // L: 5142
				int[] var95 = var94.method2566(); // L: 5143
				short[] var90 = var94.method2578(); // L: 5144
				int var13;
				if (var90 != null && var95 != null) { // L: 5145
					for (var13 = 0; var13 < var90.length; ++var13) { // L: 5146
						if (var90[var13] >= 0 && var95[var13] >= 0) { // L: 5147
							long var14 = (long)var95[var13] << 8 | (long)var90[var13]; // L: 5150
							SpritePixels var16 = (SpritePixels)Client.archive5.method7718(var14); // L: 5151
							if (var16 == null) { // L: 5152
								SpritePixels[] var17 = UserComparator3.method2923(class452.archive8, var95[var13], 0); // L: 5153
								if (var17 != null && var90[var13] < var17.length) { // L: 5154
									var16 = var17[var90[var13]]; // L: 5155
									Client.archive5.method7699(var14, var16); // L: 5156
								}
							}

							if (var16 != null) { // L: 5159
								UserComparator6.method2972(var0, var0.defaultHeight + 15); // L: 5160
								if (Client.viewportTempX > -1) { // L: 5161
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5162
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5167
					var13 = var0.defaultHeight + 15; // L: 5168
					class374.worldToScreen(var0.x, var0.y, var13); // L: 5170
					if (Client.viewportTempX > -1) { // L: 5172
						KitDefinition.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (var10 = 0; var10 < 4; ++var10) { // L: 5175
				var11 = var0.hitSplatCycles[var10]; // L: 5176
				int var78 = var0.hitSplatTypes[var10]; // L: 5177
				HitSplatDefinition var96 = null; // L: 5178
				int var80 = 0; // L: 5179
				if (var78 >= 0) { // L: 5180
					if (var11 <= Client.cycle) { // L: 5181
						continue;
					}

					var96 = class122.method3046(var0.hitSplatTypes[var10]); // L: 5182
					var80 = var96.field2142; // L: 5183
					if (var96 != null && var96.transforms != null) { // L: 5184
						var96 = var96.transform(); // L: 5185
						if (var96 == null) { // L: 5186
							var0.hitSplatCycles[var10] = -1; // L: 5187
							continue; // L: 5188
						}
					}
				} else if (var11 < 0) { // L: 5192
					continue;
				}

				var15 = var0.hitSplatTypes2[var10]; // L: 5193
				HitSplatDefinition var91 = null; // L: 5194
				if (var15 >= 0) { // L: 5195
					var91 = class122.method3046(var15); // L: 5196
					if (var91 != null && var91.transforms != null) { // L: 5197
						var91 = var91.transform();
					}
				}

				if (var11 - var80 <= Client.cycle) { // L: 5199
					if (var96 == null) { // L: 5200
						var0.hitSplatCycles[var10] = -1; // L: 5201
					} else {
						UserComparator6.method2972(var0, var0.defaultHeight / 2); // L: 5204
						if (Client.viewportTempX > -1) { // L: 5205
							boolean var97 = true; // L: 5206
							if (var10 == 1) { // L: 5207
								Client.viewportTempY -= 20; // L: 5208
							}

							if (var10 == 2) { // L: 5210
								Client.viewportTempX -= 15; // L: 5211
								Client.viewportTempY -= 10; // L: 5212
							}

							if (var10 == 3) { // L: 5214
								Client.viewportTempX += 15; // L: 5215
								Client.viewportTempY -= 10; // L: 5216
							}

							SpritePixels var18 = null; // L: 5218
							SpritePixels var19 = null; // L: 5219
							SpritePixels var20 = null; // L: 5220
							SpritePixels var21 = null; // L: 5221
							var22 = 0; // L: 5222
							var23 = 0; // L: 5223
							int var24 = 0; // L: 5224
							int var25 = 0; // L: 5225
							int var26 = 0; // L: 5226
							int var27 = 0; // L: 5227
							int var28 = 0; // L: 5228
							int var29 = 0; // L: 5229
							SpritePixels var30 = null; // L: 5230
							SpritePixels var31 = null; // L: 5231
							SpritePixels var32 = null; // L: 5232
							SpritePixels var33 = null; // L: 5233
							int var34 = 0; // L: 5234
							int var35 = 0; // L: 5235
							int var36 = 0; // L: 5236
							int var37 = 0; // L: 5237
							int var38 = 0; // L: 5238
							int var39 = 0; // L: 5239
							int var40 = 0; // L: 5240
							int var41 = 0; // L: 5241
							int var42 = 0; // L: 5242
							var18 = var96.method3948(); // L: 5243
							int var43;
							if (var18 != null) { // L: 5244
								var22 = var18.subWidth; // L: 5245
								var43 = var18.subHeight; // L: 5246
								if (var43 > var42) { // L: 5247
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5248
							}

							var19 = var96.method3949(); // L: 5250
							if (var19 != null) { // L: 5251
								var23 = var19.subWidth; // L: 5252
								var43 = var19.subHeight; // L: 5253
								if (var43 > var42) { // L: 5254
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5255
							}

							var20 = var96.method3943(); // L: 5257
							if (var20 != null) { // L: 5258
								var24 = var20.subWidth; // L: 5259
								var43 = var20.subHeight; // L: 5260
								if (var43 > var42) { // L: 5261
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5262
							}

							var21 = var96.method3951(); // L: 5264
							if (var21 != null) { // L: 5265
								var25 = var21.subWidth; // L: 5266
								var43 = var21.subHeight; // L: 5267
								if (var43 > var42) { // L: 5268
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5269
							}

							if (var91 != null) { // L: 5271
								var30 = var91.method3948(); // L: 5272
								if (var30 != null) { // L: 5273
									var34 = var30.subWidth; // L: 5274
									var43 = var30.subHeight; // L: 5275
									if (var43 > var42) { // L: 5276
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5277
								}

								var31 = var91.method3949(); // L: 5279
								if (var31 != null) { // L: 5280
									var35 = var31.subWidth; // L: 5281
									var43 = var31.subHeight; // L: 5282
									if (var43 > var42) { // L: 5283
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5284
								}

								var32 = var91.method3943(); // L: 5286
								if (var32 != null) { // L: 5287
									var36 = var32.subWidth; // L: 5288
									var43 = var32.subHeight; // L: 5289
									if (var43 > var42) { // L: 5290
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5291
								}

								var33 = var91.method3951(); // L: 5293
								if (var33 != null) { // L: 5294
									var37 = var33.subWidth; // L: 5295
									var43 = var33.subHeight; // L: 5296
									if (var43 > var42) { // L: 5297
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5298
								}
							}

							Font var82 = var96.getFont(); // L: 5303
							if (var82 == null) { // L: 5304
								var82 = Language.fontPlain11;
							}

							Font var44;
							if (var91 != null) { // L: 5305
								var44 = var91.getFont(); // L: 5306
								if (var44 == null) { // L: 5307
									var44 = Language.fontPlain11;
								}
							} else {
								var44 = Language.fontPlain11; // L: 5309
							}

							String var45 = null; // L: 5310
							String var46 = null; // L: 5311
							boolean var47 = false; // L: 5312
							int var48 = 0; // L: 5313
							var45 = var96.getString(var0.hitSplatValues[var10]); // L: 5314
							int var92 = var82.stringWidth(var45); // L: 5315
							if (var91 != null) { // L: 5316
								var46 = var91.getString(var0.hitSplatValues2[var10]); // L: 5317
								var48 = var44.stringWidth(var46); // L: 5318
							}

							int var49 = 0; // L: 5320
							int var50 = 0; // L: 5321
							if (var23 > 0) { // L: 5322
								if (var20 == null && var21 == null) { // L: 5323
									var49 = 1; // L: 5324
								} else {
									var49 = var92 / var23 + 1;
								}
							}

							if (var91 != null && var35 > 0) { // L: 5326 5327
								if (var32 == null && var33 == null) { // L: 5328
									var50 = 1; // L: 5329
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5332
							int var52 = var51; // L: 5333
							if (var22 > 0) { // L: 5334
								var51 += var22;
							}

							var51 += 2; // L: 5335
							int var53 = var51; // L: 5336
							if (var24 > 0) { // L: 5337
								var51 += var24;
							}

							int var54 = var51; // L: 5338
							int var55 = var51; // L: 5339
							int var56;
							if (var23 > 0) { // L: 5340
								var56 = var49 * var23; // L: 5341
								var51 += var56; // L: 5342
								var55 += (var56 - var92) / 2; // L: 5343
							} else {
								var51 += var92; // L: 5346
							}

							var56 = var51; // L: 5348
							if (var25 > 0) { // L: 5349
								var51 += var25;
							}

							int var57 = 0; // L: 5350
							int var58 = 0; // L: 5351
							int var59 = 0; // L: 5352
							int var60 = 0; // L: 5353
							int var61 = 0; // L: 5354
							int var62;
							if (var91 != null) { // L: 5355
								var51 += 2; // L: 5356
								var57 = var51; // L: 5357
								if (var34 > 0) { // L: 5358
									var51 += var34;
								}

								var51 += 2; // L: 5359
								var58 = var51; // L: 5360
								if (var36 > 0) { // L: 5361
									var51 += var36;
								}

								var59 = var51; // L: 5362
								var61 = var51; // L: 5363
								if (var35 > 0) { // L: 5364
									var62 = var35 * var50; // L: 5365
									var51 += var62; // L: 5366
									var61 += (var62 - var48) / 2; // L: 5367
								} else {
									var51 += var48; // L: 5370
								}

								var60 = var51; // L: 5372
								if (var37 > 0) { // L: 5373
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var10] - Client.cycle; // L: 5375
							int var63 = var96.field2130 - var62 * var96.field2130 / var96.field2142; // L: 5376
							int var64 = var62 * var96.field2147 / var96.field2142 + -var96.field2147; // L: 5377
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5378
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5379
							int var67 = var66; // L: 5380
							int var68 = var66 + var42; // L: 5381
							int var69 = var66 + var96.field2151 + 15; // L: 5382
							int var70 = var69 - var82.maxAscent; // L: 5383
							int var71 = var69 + var82.maxDescent; // L: 5384
							if (var70 < var66) { // L: 5385
								var67 = var70;
							}

							if (var71 > var68) { // L: 5386
								var68 = var71;
							}

							int var72 = 0; // L: 5387
							int var73;
							int var74;
							if (var91 != null) { // L: 5388
								var72 = var66 + var91.field2151 + 15; // L: 5389
								var73 = var72 - var44.maxAscent; // L: 5390
								var74 = var72 + var44.maxDescent; // L: 5391
								if (var73 < var67) { // L: 5392
									;
								}

								if (var74 > var68) { // L: 5393
									;
								}
							}

							var73 = 255; // L: 5395
							if (var96.field2154 >= 0) { // L: 5396
								var73 = (var62 << 8) / (var96.field2142 - var96.field2154);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5397
								if (var18 != null) { // L: 5398
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5399
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5400
									for (var74 = 0; var74 < var49; ++var74) { // L: 5401
										var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 5402
									}
								}

								if (var21 != null) { // L: 5405
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var55 + var65, var69, var96.textColor, 0, var73); // L: 5406
								if (var91 != null) { // L: 5407
									if (var30 != null) { // L: 5408
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5409
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5410
										for (var74 = 0; var74 < var50; ++var74) { // L: 5411
											var31.drawTransAt(var35 * var74 + (var65 + var59 - var39), var66, var73); // L: 5412
										}
									}

									if (var33 != null) { // L: 5415
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var91.textColor, 0, var73); // L: 5416
								}
							} else {
								if (var18 != null) { // L: 5420
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5421
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 5422
									for (var74 = 0; var74 < var49; ++var74) { // L: 5423
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66); // L: 5424
									}
								}

								if (var21 != null) { // L: 5427
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var82.draw(var45, var65 + var55, var69, var96.textColor | -16777216, 0); // L: 5428
								if (var91 != null) { // L: 5429
									if (var30 != null) { // L: 5430
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5431
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 5432
										for (var74 = 0; var74 < var50; ++var74) { // L: 5433
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 5434
										}
									}

									if (var33 != null) { // L: 5437
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var91.textColor | -16777216, 0); // L: 5438
								}
							}
						}
					}
				}
			}

		}
	} // L: 5443

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)V",
		garbageValue = "87894197"
	)
	static final void method508(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 7976

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7977 7978 7983
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 7979
				var10 = var11; // L: 7980
				break;
			}
		}

		if (var10 == null) { // L: 7985
			var10 = new PendingSpawn(); // L: 7986
			var10.plane = var0; // L: 7987
			var10.type = var3; // L: 7988
			var10.x = var1; // L: 7989
			var10.y = var2; // L: 7990
			var10.field1135 = -1; // L: 7991
			Messages.method2763(var10); // L: 7992
			Client.pendingSpawns.addFirst(var10); // L: 7993
		}

		var10.field1127 = var4; // L: 7995
		var10.field1124 = var5; // L: 7996
		var10.field1126 = var6; // L: 7997
		var10.delay = var8; // L: 7998
		var10.hitpoints = var9; // L: 7999
		var10.method2361(var7); // L: 8000
	} // L: 8001
}
