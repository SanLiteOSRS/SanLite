import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("av")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1764660817"
	)
	static int method8699(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "2080138033"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4663
			byte var2 = 4; // L: 4664
			int var3 = var2 + 6; // L: 4665
			int var4 = var2 + 6; // L: 4666
			int var5 = StudioGame.fontPlain12.lineWidth(var0, 250); // L: 4667
			int var6 = StudioGame.fontPlain12.lineCount(var0, 250) * 13; // L: 4668
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0); // L: 4669
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215); // L: 4670
			StudioGame.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4671
			int var7 = var3 - var2; // L: 4672
			int var8 = var4 - var2; // L: 4673
			int var9 = var2 + var5 + var2; // L: 4674
			int var10 = var2 + var6 + var2; // L: 4675

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4677
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 4678
					Client.field717[var11] = true;
				}
			}

			if (var1) { // L: 4681
				KitDefinition.rasterProvider.drawFull(0, 0); // L: 4682
			} else {
				class47.method889(var3, var4, var5, var6); // L: 4685
			}

		}
	} // L: 4687

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "([Lme;IB)V",
		garbageValue = "-77"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12107
			Widget var3 = var0[var2]; // L: 12108
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !UserComparator4.isComponentHidden(var3))) { // L: 12109 12110 12111
				if (var3.type == 0) { // L: 12112
					if (!var3.isIf3 && UserComparator4.isComponentHidden(var3) && var3 != class308.mousedOverWidgetIf1) { // L: 12113
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12114
					if (var3.children != null) { // L: 12115
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12116
					if (var4 != null) { // L: 12117
						GameBuild.method6659(var4.group);
					}
				}

				if (var3.type == 6) { // L: 12119
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12120
						boolean var8 = MenuAction.runCs1(var3); // L: 12121
						if (var8) { // L: 12123
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12124
						}

						if (var5 != -1) { // L: 12125
							SequenceDefinition var6 = class140.SequenceDefinition_get(var5); // L: 12126
							if (!var6.isCachedModelIdSet()) { // L: 12127
								for (var3.modelFrameCycle += Client.field578; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class303.invalidateWidget(var3)) { // L: 12128 12129 12136
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12130
									++var3.modelFrame; // L: 12131
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12132
										var3.modelFrame -= var6.frameCount; // L: 12133
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12134
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field578; // L: 12140
								int var7 = var6.method4174(); // L: 12141
								if (var3.modelFrame >= var7) { // L: 12142
									var3.modelFrame -= var6.frameCount; // L: 12143
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12144
										var3.modelFrame = 0;
									}
								}

								class303.invalidateWidget(var3); // L: 12146
							}
						}
					}

					if (var3.field3684 != 0 && !var3.isIf3) { // L: 12150
						int var9 = var3.field3684 >> 16; // L: 12151
						var5 = var3.field3684 << 16 >> 16; // L: 12152
						var9 *= Client.field578; // L: 12153
						var5 *= Client.field578; // L: 12154
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12155
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12156
						class303.invalidateWidget(var3); // L: 12157
					}
				}
			}
		}

	} // L: 12161
}
