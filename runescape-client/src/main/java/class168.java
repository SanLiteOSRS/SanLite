import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class168 {
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("mouseWheel")
	static class213 mouseWheel;
	@ObfuscatedName("af")
	public short[] field1796;
	@ObfuscatedName("aj")
	public short[] field1794;

	class168(int var1) {
		ItemComposition var2 = class341.ItemComposition_get(var1); // L: 12
		if (var2.method4001()) { // L: 13
			this.field1796 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1796, 0, this.field1796.length); // L: 15
		}

		if (var2.method3990()) { // L: 17
			this.field1794 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1794, 0, this.field1794.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IB)V",
		garbageValue = "-39"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12035
			Widget var3 = var0[var2]; // L: 12036
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class59.isComponentHidden(var3))) { // L: 12037 12038 12039
				if (var3.type == 0) { // L: 12040
					if (!var3.isIf3 && class59.isComponentHidden(var3) && var3 != class433.mousedOverWidgetIf1) { // L: 12041
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12042
					if (var3.children != null) { // L: 12043
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12044
					if (var4 != null) { // L: 12045
						class401.method7505(var4.group);
					}
				}

				if (var3.type == 6) { // L: 12047
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12048
						boolean var8 = class345.runCs1(var3); // L: 12049
						if (var8) { // L: 12051
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12052
						}

						if (var5 != -1) { // L: 12053
							SequenceDefinition var6 = class9.SequenceDefinition_get(var5); // L: 12054
							if (!var6.isCachedModelIdSet()) { // L: 12055
								for (var3.modelFrameCycle += Client.field576; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; FaceNormal.invalidateWidget(var3)) { // L: 12056 12057 12064
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12058
									++var3.modelFrame; // L: 12059
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12060
										var3.modelFrame -= var6.frameCount; // L: 12061
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12062
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field576; // L: 12068
								int var7 = var6.method4106(); // L: 12069
								if (var3.modelFrame >= var7) { // L: 12070
									var3.modelFrame -= var6.frameCount; // L: 12071
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12072
										var3.modelFrame = 0;
									}
								}

								FaceNormal.invalidateWidget(var3); // L: 12074
							}
						}
					}

					if (var3.field3758 != 0 && !var3.isIf3) { // L: 12078
						int var9 = var3.field3758 >> 16; // L: 12079
						var5 = var3.field3758 << 16 >> 16; // L: 12080
						var9 *= Client.field576; // L: 12081
						var5 *= Client.field576; // L: 12082
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12083
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12084
						FaceNormal.invalidateWidget(var3); // L: 12085
					}
				}
			}
		}

	} // L: 12089
}
