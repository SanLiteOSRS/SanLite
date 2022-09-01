import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class282 {
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 1739476279
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbb;",
		garbageValue = "-83"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 39
		return var2.getMessage(var1); // L: 40
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-322600603"
	)
	public static boolean method5436(int var0) {
		return (var0 >> 28 & 1) != 0; // L: 37
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "2064384403"
	)
	public static int method5435(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1548687437"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4991
			if (ParamComposition.loadInterface(var0)) { // L: 4992
				Widget[] var1 = class358.Widget_interfaceComponents[var0]; // L: 4993

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4994
					Widget var3 = var1[var2]; // L: 4995
					if (var3.onLoad != null) { // L: 4996
						ScriptEvent var4 = new ScriptEvent(); // L: 4997
						var4.widget = var3; // L: 4998
						var4.args = var3.onLoad; // L: 4999
						GraphicsObject.runScript(var4, 5000000, 0); // L: 5000
					}
				}

			}
		}
	} // L: 5003

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(Lgh;IIII)V",
		garbageValue = "1702625955"
	)
	static void method5426(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && FriendsChatMember.clientPreferences.method2226() != 0) { // L: 3555
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3556
				int var4 = var0.soundEffects[var1]; // L: 3557
				if (var4 != 0) { // L: 3561
					int var7 = var4 >> 8; // L: 3562
					int var8 = var4 >> 4 & 7; // L: 3563
					int var9 = var4 & 15; // L: 3564
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3565
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3566
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3567
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3568
					int var10 = (var2 - 64) / 128; // L: 3569
					int var11 = (var3 - 64) / 128; // L: 3570
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3571
					++Client.soundEffectCount; // L: 3572
				}

			}
		}
	} // L: 3574

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IB)V",
		garbageValue = "48"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11535
			Widget var3 = var0[var2]; // L: 11536
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !Tiles.isComponentHidden(var3))) { // L: 11537 11538 11539
				int var5;
				if (var3.type == 0) { // L: 11540
					if (!var3.isIf3 && Tiles.isComponentHidden(var3) && var3 != class113.mousedOverWidgetIf1) { // L: 11541
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11542
					if (var3.children != null) { // L: 11543
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11544
					if (var4 != null) { // L: 11545
						var5 = var4.group; // L: 11546
						if (ParamComposition.loadInterface(var5)) { // L: 11548
							drawModelComponents(class358.Widget_interfaceComponents[var5], -1); // L: 11549
						}
					}
				}

				if (var3.type == 6) { // L: 11553
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11554
						boolean var8 = WorldMapRegion.runCs1(var3); // L: 11555
						if (var8) { // L: 11557
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11558
						}

						if (var5 != -1) { // L: 11559
							SequenceDefinition var6 = ByteArrayPool.SequenceDefinition_get(var5); // L: 11560
							if (!var6.isCachedModelIdSet()) { // L: 11561
								for (var3.modelFrameCycle += Client.field599; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class125.invalidateWidget(var3)) { // L: 11562 11563 11570
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11564
									++var3.modelFrame; // L: 11565
									if (var3.modelFrame >= var6.frameIds.length) { // L: 11566
										var3.modelFrame -= var6.frameCount; // L: 11567
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11568
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field599; // L: 11574
								int var7 = var6.method3729(); // L: 11575
								if (var3.modelFrame >= var7) { // L: 11576
									var3.modelFrame -= var6.frameCount; // L: 11577
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 11578
										var3.modelFrame = 0;
									}
								}

								class125.invalidateWidget(var3); // L: 11580
							}
						}
					}

					if (var3.field3414 != 0 && !var3.isIf3) { // L: 11584
						int var9 = var3.field3414 >> 16; // L: 11585
						var5 = var3.field3414 << 16 >> 16; // L: 11586
						var9 *= Client.field599; // L: 11587
						var5 *= Client.field599; // L: 11588
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 11589
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11590
						class125.invalidateWidget(var3); // L: 11591
					}
				}
			}
		}

	} // L: 11595
}
