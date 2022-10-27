import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1275956487
	)
	@Export("count")
	int count;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 582496861
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1600395461
	)
	@Export("type")
	int type;
	@ObfuscatedName("x")
	@Export("sender")
	String sender;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("d")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("n")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "75"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = class417.method7781(); // L: 23
		this.cycle = Client.cycle; // L: 24
		this.type = var1; // L: 25
		this.sender = var2; // L: 26
		this.fillSenderUsername(); // L: 27
		this.prefix = var3; // L: 28
		this.text = var4; // L: 29
		this.clearIsFromFriend(); // L: 30
		this.clearIsFromIgnored(); // L: 31
	} // L: 32

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-732833419"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 35
	} // L: 36

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1626696256"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 39
			this.fillIsFromFriend(); // L: 40
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 42
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-548011858"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = DecorativeObject.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 46
	} // L: 47

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1930798269"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 50
	} // L: 51

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-51"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 54
			this.fillIsFromIgnored(); // L: 55
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 57
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1350273895"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = DecorativeObject.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 61
	} // L: 62

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(ItemLayer.method4055(this.sender), ViewportMouse.loginType); // L: 65
		} else {
			this.senderUsername = null; // L: 66
		}

	} // L: 67

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-406725449"
	)
	static int method1161(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 4874
			int var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4875
			NPCComposition var4 = HealthBarDefinition.getNpcDefinition(var3); // L: 4876
			Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4877
			return 1; // L: 4878
		} else {
			return 2; // L: 4880
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lkn;III)V",
		garbageValue = "-1032416860"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 11119
			Login.method2081(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId); // L: 11120
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11123
			var3 = class313.Widget_getSpellActionName(var0); // L: 11124
			if (var3 != null) { // L: 11125
				Login.method2081(var3, GameObject.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId); // L: 11126
			}
		}

		if (var0.buttonType == 3) { // L: 11130
			class16.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11131
		}

		if (var0.buttonType == 4) { // L: 11134
			class16.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 11135
		}

		if (var0.buttonType == 5) { // L: 11138
			class16.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 11139
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11142
			class16.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 11143
		}

		int var4;
		int var5;
		int var17;
		if (var0.type == 2) { // L: 11146
			var17 = 0; // L: 11147

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 11148
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 11149
					int var6 = (var0.paddingX + 32) * var5; // L: 11150
					int var7 = (var0.paddingY + 32) * var4; // L: 11151
					if (var17 < 20) { // L: 11152
						var6 += var0.inventoryXOffsets[var17]; // L: 11153
						var7 += var0.inventoryYOffsets[var17]; // L: 11154
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 11156
						Client.dragItemSlotDestination = var17; // L: 11157
						class168.hoveredItemContainer = var0; // L: 11158
						if (var0.itemIds[var17] > 0) { // L: 11159
							label314: {
								ItemComposition var8 = MidiPcmStream.ItemComposition_get(var0.itemIds[var17] - 1); // L: 11160
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) { // L: 11162
									var10 = class197.getWidgetFlags(var0); // L: 11164
									var9 = (var10 >> 30 & 1) != 0; // L: 11166
									if (var9) { // L: 11168
										if (var0.id != class230.selectedItemWidget || var17 != class1.selectedItemSlot) { // L: 11169
											Login.method2081("Use", Client.selectedItemName + " " + "->" + " " + GameObject.colorStartTag(16748608) + var8.name, 31, 0, var17, var0.id, var8.id); // L: 11170
										}
										break label314;
									}
								}

								if (Client.isSpellSelected) { // L: 11177
									var10 = class197.getWidgetFlags(var0); // L: 11179
									var9 = (var10 >> 30 & 1) != 0; // L: 11181
									if (var9) { // L: 11183
										if ((UserComparator5.selectedSpellFlags & 16) == 16) { // L: 11184
											Login.method2081(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + GameObject.colorStartTag(16748608) + var8.name, 32, 0, var17, var0.id, var8.id); // L: 11185
										}
										break label314;
									}
								}

								String[] var20 = var8.inventoryActions; // L: 11191
								var10 = -1; // L: 11192
								if (Client.shiftClickDrop && class174.method3399()) { // L: 11193
									var10 = var8.getShiftClickIndex(); // L: 11194
								}

								int var12 = class197.getWidgetFlags(var0); // L: 11197
								boolean var11 = (var12 >> 30 & 1) != 0; // L: 11199
								if (var11) { // L: 11201
									for (int var13 = 4; var13 >= 3; --var13) { // L: 11202
										if (var13 != var10) { // L: 11203
											class136.addWidgetItemMenuItem(var0, var8, var17, var13, false); // L: 11204
										}
									}
								}

								Object var10000 = null; // L: 11207
								if (ServerPacket.method5399(class197.getWidgetFlags(var0))) {
									Login.method2081("Use", GameObject.colorStartTag(16748608) + var8.name, 38, 0, var17, var0.id, var8.id); // L: 11208
								}

								int var14 = class197.getWidgetFlags(var0); // L: 11212
								boolean var22 = (var14 >> 30 & 1) != 0; // L: 11214
								int var15;
								if (var22) { // L: 11216
									for (var15 = 2; var15 >= 0; --var15) { // L: 11217
										if (var10 != var15) { // L: 11218
											class136.addWidgetItemMenuItem(var0, var8, var17, var15, false); // L: 11219
										}
									}

									if (var10 >= 0) { // L: 11221
										class136.addWidgetItemMenuItem(var0, var8, var17, var10, true); // L: 11222
									}
								}

								var20 = var0.itemActions; // L: 11225
								if (var20 != null) { // L: 11226
									for (var15 = 4; var15 >= 0; --var15) { // L: 11227
										if (var20[var15] != null) { // L: 11228
											byte var16 = 0; // L: 11229
											if (var15 == 0) { // L: 11230
												var16 = 39;
											}

											if (var15 == 1) { // L: 11231
												var16 = 40;
											}

											if (var15 == 2) { // L: 11232
												var16 = 41;
											}

											if (var15 == 3) { // L: 11233
												var16 = 42;
											}

											if (var15 == 4) { // L: 11234
												var16 = 43;
											}

											Login.method2081(var20[var15], GameObject.colorStartTag(16748608) + var8.name, var16, 0, var17, var0.id, var8.id); // L: 11235
										}
									}
								}

								Login.method2081("Examine", GameObject.colorStartTag(16748608) + var8.name, 1005, 0, var17, var0.id, var8.id); // L: 11240
							}
						}
					}

					++var17; // L: 11246
				}
			}
		}

		if (var0.isIf3) { // L: 11250
			if (Client.isSpellSelected) { // L: 11251
				var4 = class197.getWidgetFlags(var0); // L: 11253
				boolean var23 = (var4 >> 21 & 1) != 0; // L: 11255
				if (var23 && (UserComparator5.selectedSpellFlags & 32) == 32) { // L: 11257
					Login.method2081(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 11258
				}
			} else {
				for (var17 = 9; var17 >= 5; --var17) { // L: 11263
					String var19 = class380.method7205(var0, var17); // L: 11264
					if (var19 != null) { // L: 11265
						Login.method2081(var19, var0.dataText, 1007, var17 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11266
					}
				}

				var3 = class313.Widget_getSpellActionName(var0); // L: 11270
				if (var3 != null) { // L: 11271
					Login.method2081(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 11272
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 11275
					String var18 = class380.method7205(var0, var4); // L: 11276
					if (var18 != null) { // L: 11277
						UserComparator8.method2744(var18, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11278
					}
				}

				var5 = class197.getWidgetFlags(var0); // L: 11283
				boolean var21 = (var5 & 1) != 0; // L: 11285
				if (var21) { // L: 11287
					class16.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11288
				}
			}
		}

	} // L: 11293

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-805716886"
	)
	static final void method1150(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12191
		BufferedSink.clientPreferences.updateSoundEffectVolume(var0); // L: 12192
	} // L: 12193
}
