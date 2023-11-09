import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class31 {
	@ObfuscatedName("aj")
	public static Applet field166;
	@ObfuscatedName("al")
	public static String field161;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 803191375
	)
	static int field167;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1643583259
	)
	static int field164;

	static {
		field166 = null; // L: 10
		field161 = ""; // L: 11
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "([Lmy;IB)V",
		garbageValue = "108"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11559
			Widget var3 = var0[var2]; // L: 11560
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !DecorativeObject.isComponentHidden(var3))) { // L: 11561 11562 11563
				int var5;
				if (var3.type == 0) { // L: 11564
					if (!var3.isIf3 && DecorativeObject.isComponentHidden(var3) && var3 != InvDefinition.mousedOverWidgetIf1) { // L: 11565
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11566
					if (var3.children != null) { // L: 11567
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11568
					if (var4 != null) { // L: 11569
						var5 = var4.group; // L: 11570
						if (GrandExchangeEvent.loadInterface(var5)) { // L: 11572
							drawModelComponents(class155.Widget_interfaceComponents[var5], -1); // L: 11573
						}
					}
				}

				if (var3.type == 6) { // L: 11577
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11578
						boolean var8 = JagexCache.runCs1(var3); // L: 11579
						if (var8) { // L: 11581
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11582
						}

						if (var5 != -1) { // L: 11583
							SequenceDefinition var6 = Coord.SequenceDefinition_get(var5); // L: 11584
							if (!var6.isCachedModelIdSet()) { // L: 11585
								for (var3.modelFrameCycle += Client.field631; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class69.invalidateWidget(var3)) { // L: 11586 11587 11594
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11588
									++var3.modelFrame; // L: 11589
									if (var3.modelFrame >= var6.frameIds.length) { // L: 11590
										var3.modelFrame -= var6.frameCount; // L: 11591
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11592
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field631; // L: 11598
								int var7 = var6.method4015(); // L: 11599
								if (var3.modelFrame >= var7) { // L: 11600
									var3.modelFrame -= var6.frameCount; // L: 11601
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 11602
										var3.modelFrame = 0;
									}
								}

								class69.invalidateWidget(var3); // L: 11604
							}
						}
					}

					if (var3.field3582 != 0 && !var3.isIf3) { // L: 11608
						int var9 = var3.field3582 >> 16; // L: 11609
						var5 = var3.field3582 << 16 >> 16; // L: 11610
						var9 *= Client.field631; // L: 11611
						var5 *= Client.field631; // L: 11612
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 11613
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11614
						class69.invalidateWidget(var3); // L: 11615
					}
				}
			}
		}

	} // L: 11619

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	static final void method445() {
		Client.field525 = Client.cycleCntr; // L: 11988
		class18.FriendsChatManager_inFriendsChat = true; // L: 11989
	} // L: 11990
}
