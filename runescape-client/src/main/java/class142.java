import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class142 extends class143 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1117255129
	)
	int field1644;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class142(class146 var1) {
		this.this$0 = var1;
		this.field1644 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1644 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3277(this.field1644); // L: 123
	} // L: 124

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "-51"
	)
	static int method3122(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 427
			return class301.method5746(var0, var1, var2);
		} else if (var0 < 1100) { // L: 428
			return UserComparator10.method2903(var0, var1, var2);
		} else if (var0 < 1200) { // L: 429
			return SecureRandomFuture.method2151(var0, var1, var2);
		} else if (var0 < 1300) { // L: 430
			return class60.method1195(var0, var1, var2);
		} else if (var0 < 1400) { // L: 431
			return class9.method83(var0, var1, var2);
		} else if (var0 < 1500) { // L: 432
			return class20.method297(var0, var1, var2);
		} else if (var0 < 1600) { // L: 433
			return class10.method84(var0, var1, var2);
		} else if (var0 < 1700) { // L: 434
			return class423.method7819(var0, var1, var2);
		} else if (var0 < 1800) { // L: 435
			return Player.method2365(var0, var1, var2);
		} else if (var0 < 1900) { // L: 436
			return WorldMapIcon_1.method5097(var0, var1, var2);
		} else if (var0 < 2000) { // L: 437
			return class319.method6071(var0, var1, var2);
		} else if (var0 < 2100) { // L: 438
			return UserComparator10.method2903(var0, var1, var2);
		} else if (var0 < 2200) { // L: 439
			return SecureRandomFuture.method2151(var0, var1, var2);
		} else if (var0 < 2300) { // L: 440
			return class60.method1195(var0, var1, var2);
		} else if (var0 < 2400) { // L: 441
			return class9.method83(var0, var1, var2);
		} else if (var0 < 2500) { // L: 442
			return class20.method297(var0, var1, var2);
		} else if (var0 < 2600) { // L: 443
			return VarcInt.method3638(var0, var1, var2);
		} else if (var0 < 2700) { // L: 444
			return class47.method879(var0, var1, var2);
		} else if (var0 < 2800) { // L: 445
			return ClanChannel.method3381(var0, var1, var2);
		} else if (var0 < 2900) { // L: 446
			return HealthBarUpdate.method2423(var0, var1, var2);
		} else if (var0 < 3000) { // L: 447
			return class319.method6071(var0, var1, var2);
		} else if (var0 < 3200) { // L: 448
			return class9.method77(var0, var1, var2);
		} else if (var0 < 3300) { // L: 449
			return ViewportMouse.method4923(var0, var1, var2);
		} else if (var0 < 3400) { // L: 450
			return ApproximateRouteStrategy.method1246(var0, var1, var2);
		} else if (var0 < 3500) { // L: 451
			return GroundObject.method4387(var0, var1, var2);
		} else if (var0 < 3600) { // L: 452
			return class467.method8435(var0, var1, var2);
		} else if (var0 < 3700) { // L: 453
			return class92.method2366(var0, var1, var2);
		} else if (var0 < 3800) { // L: 454
			return Interpreter.method2073(var0, var1, var2);
		} else if (var0 < 3900) { // L: 455
			return class345.method6645(var0, var1, var2);
		} else if (var0 < 4000) { // L: 456
			return Occluder.method4753(var0, var1, var2);
		} else if (var0 < 4100) { // L: 457
			return MouseRecorder.method2297(var0, var1, var2);
		} else if (var0 < 4200) { // L: 458
			return FriendSystem.method1934(var0, var1, var2);
		} else if (var0 < 4300) { // L: 459
			return class339.method6628(var0, var1, var2);
		} else if (var0 < 5100) { // L: 460
			return class335.method6600(var0, var1, var2);
		} else if (var0 < 5400) { // L: 461
			return class113.method2836(var0, var1, var2);
		} else if (var0 < 5600) { // L: 462
			return WorldMapRectangle.method5512(var0, var1, var2);
		} else if (var0 < 5700) { // L: 463
			return RouteStrategy.method4230(var0, var1, var2);
		} else if (var0 < 6300) { // L: 464
			return ApproximateRouteStrategy.method1247(var0, var1, var2);
		} else if (var0 < 6600) { // L: 465
			return class167.method3413(var0, var1, var2);
		} else if (var0 < 6700) { // L: 466
			return WorldMapRectangle.method5511(var0, var1, var2);
		} else if (var0 < 6800) { // L: 467
			return GrandExchangeOfferOwnWorldComparator.method1249(var0, var1, var2);
		} else if (var0 < 6900) { // L: 468
			return class12.method167(var0, var1, var2);
		} else if (var0 < 7000) { // L: 469
			return MouseRecorder.method2295(var0, var1, var2);
		} else if (var0 < 7100) { // L: 470
			return class159.method3327(var0, var1, var2);
		} else if (var0 < 7200) { // L: 471
			return class219.method4284(var0, var1, var2);
		} else if (var0 < 7300) { // L: 472
			return class30.method447(var0, var1, var2);
		} else if (var0 < 7500) { // L: 473
			return class18.method274(var0, var1, var2);
		} else if (var0 < 7600) { // L: 474
			return WorldMapScaleHandler.method5645(var0, var1, var2);
		} else {
			return var0 < 7700 ? MenuAction.method2084(var0, var1, var2) : 2; // L: 475 476
		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "([Lmt;II)V",
		garbageValue = "-535637665"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12168
			Widget var3 = var0[var2]; // L: 12169
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !WorldMapDecorationType.isComponentHidden(var3))) { // L: 12170 12171 12172
				int var5;
				if (var3.type == 0) { // L: 12173
					if (!var3.isIf3 && WorldMapDecorationType.isComponentHidden(var3) && var3 != WorldMapScaleHandler.mousedOverWidgetIf1) { // L: 12174
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12175
					if (var3.children != null) { // L: 12176
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12177
					if (var4 != null) { // L: 12178
						var5 = var4.group; // L: 12179
						if (Login.loadInterface(var5)) { // L: 12181
							drawModelComponents(ArchiveLoader.Widget_interfaceComponents[var5], -1); // L: 12182
						}
					}
				}

				if (var3.type == 6) { // L: 12186
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12187
						boolean var8 = GrandExchangeOfferOwnWorldComparator.runCs1(var3); // L: 12188
						if (var8) { // L: 12190
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12191
						}

						if (var5 != -1) { // L: 12192
							SequenceDefinition var6 = class135.SequenceDefinition_get(var5); // L: 12193
							if (!var6.isCachedModelIdSet()) { // L: 12194
								for (var3.modelFrameCycle += Client.field702; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class200.invalidateWidget(var3)) { // L: 12195 12196 12203
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12197
									++var3.modelFrame; // L: 12198
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12199
										var3.modelFrame -= var6.frameCount; // L: 12200
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12201
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field702; // L: 12207
								int var7 = var6.method4074(); // L: 12208
								if (var3.modelFrame >= var7) { // L: 12209
									var3.modelFrame -= var6.frameCount; // L: 12210
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12211
										var3.modelFrame = 0;
									}
								}

								class200.invalidateWidget(var3); // L: 12213
							}
						}
					}

					if (var3.field3680 != 0 && !var3.isIf3) { // L: 12217
						int var9 = var3.field3680 >> 16; // L: 12218
						var5 = var3.field3680 << 16 >> 16; // L: 12219
						var9 *= Client.field702; // L: 12220
						var5 *= Client.field702; // L: 12221
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12222
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12223
						class200.invalidateWidget(var3); // L: 12224
					}
				}
			}
		}

	} // L: 12228
}
