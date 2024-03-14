import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class163 extends class145 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -837953891
	)
	int field1792;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1269869285
	)
	int field1793;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class163(class148 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1792 = var1.readInt(); // L: 274
		this.field1793 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3335(this.field1792, this.field1793); // L: 279
	} // L: 280

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "([Lng;II)V",
		garbageValue = "1981220516"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12278
			Widget var3 = var0[var2]; // L: 12279
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !PcmPlayer.isComponentHidden(var3))) { // L: 12280 12281 12282
				if (var3.type == 0) { // L: 12283
					if (!var3.isIf3 && PcmPlayer.isComponentHidden(var3) && var3 != class134.mousedOverWidgetIf1) { // L: 12284
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12285
					if (var3.children != null) { // L: 12286
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12287
					if (var4 != null) { // L: 12288
						WorldMapManager.method4881(var4.group);
					}
				}

				if (var3.type == 6) { // L: 12290
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12291
						boolean var8 = class341.runCs1(var3); // L: 12292
						if (var8) { // L: 12294
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12295
						}

						if (var5 != -1) { // L: 12296
							SequenceDefinition var6 = MilliClock.SequenceDefinition_get(var5); // L: 12297
							if (!var6.isCachedModelIdSet()) { // L: 12298
								for (var3.modelFrameCycle += Client.field604; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; UserComparator5.invalidateWidget(var3)) { // L: 12299 12300 12307
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12301
									++var3.modelFrame; // L: 12302
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12303
										var3.modelFrame -= var6.frameCount; // L: 12304
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12305
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field604; // L: 12311
								int var7 = var6.method4065(); // L: 12312
								if (var3.modelFrame >= var7) { // L: 12313
									var3.modelFrame -= var6.frameCount; // L: 12314
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12315
										var3.modelFrame = 0;
									}
								}

								UserComparator5.invalidateWidget(var3); // L: 12317
							}
						}
					}

					if (var3.field3782 != 0 && !var3.isIf3) { // L: 12321
						int var9 = var3.field3782 >> 16; // L: 12322
						var5 = var3.field3782 << 16 >> 16; // L: 12323
						var9 *= Client.field604; // L: 12324
						var5 *= Client.field604; // L: 12325
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12326
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12327
						UserComparator5.invalidateWidget(var3); // L: 12328
					}
				}
			}
		}

	} // L: 12332
}
