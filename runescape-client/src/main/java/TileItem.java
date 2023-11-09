import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("gp")
	static String field1318;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 176307405
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1745152527
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1724221235
	)
	int field1317;

	TileItem() {
		this.field1317 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "77"
	)
	void method2663(int var1) {
		this.field1317 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "-112"
	)
	@Export("getModel")
	protected final Model getModel() {
		return HealthBarUpdate.ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1791885272"
	)
	boolean method2671(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1317 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "2142933215"
	)
	static class133 method2675(int var0) {
		if (class20.method304(var0) != 0) { // L: 381
			return null; // L: 382
		} else {
			class133 var2 = (class133)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 386
			class133 var1;
			if (var2 != null) { // L: 387
				var1 = var2; // L: 388
			} else {
				var2 = class211.method4301(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 391
				if (var2 != null) { // L: 392
					SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
				}

				var1 = var2; // L: 393
			}

			return var1; // L: 395
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method2676() {
		if (Client.field614) { // L: 4750
			MouseHandler.addPlayerToScene(MusicPatchNode.localPlayer, false); // L: 4751
		}

	} // L: 4753

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "([Lmq;IB)V",
		garbageValue = "21"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11576
			Widget var3 = var0[var2]; // L: 11577
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class393.isComponentHidden(var3))) { // L: 11578 11579 11580
				int var5;
				if (var3.type == 0) { // L: 11581
					if (!var3.isIf3 && class393.isComponentHidden(var3) && var3 != MidiPcmStream.mousedOverWidgetIf1) { // L: 11582
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11583
					if (var3.children != null) { // L: 11584
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11585
					if (var4 != null) { // L: 11586
						var5 = var4.group; // L: 11587
						if (SoundSystem.loadInterface(var5)) { // L: 11589
							drawModelComponents(VerticalAlignment.Widget_interfaceComponents[var5], -1); // L: 11590
						}
					}
				}

				if (var3.type == 6) { // L: 11594
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11595
						boolean var8 = class452.runCs1(var3); // L: 11596
						if (var8) { // L: 11598
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11599
						}

						if (var5 != -1) { // L: 11600
							SequenceDefinition var6 = ItemContainer.SequenceDefinition_get(var5); // L: 11601
							if (!var6.isCachedModelIdSet()) { // L: 11602
								for (var3.modelFrameCycle += Client.field564; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class144.invalidateWidget(var3)) { // L: 11603 11604 11611
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11605
									++var3.modelFrame; // L: 11606
									if (var3.modelFrame >= var6.frameIds.length) { // L: 11607
										var3.modelFrame -= var6.frameCount; // L: 11608
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11609
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field564; // L: 11615
								int var7 = var6.method4135(); // L: 11616
								if (var3.modelFrame >= var7) { // L: 11617
									var3.modelFrame -= var6.frameCount; // L: 11618
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 11619
										var3.modelFrame = 0;
									}
								}

								class144.invalidateWidget(var3); // L: 11621
							}
						}
					}

					if (var3.field3626 != 0 && !var3.isIf3) { // L: 11625
						int var9 = var3.field3626 >> 16; // L: 11626
						var5 = var3.field3626 << 16 >> 16; // L: 11627
						var9 *= Client.field564; // L: 11628
						var5 *= Client.field564; // L: 11629
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 11630
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11631
						class144.invalidateWidget(var3); // L: 11632
					}
				}
			}
		}

	} // L: 11636
}
