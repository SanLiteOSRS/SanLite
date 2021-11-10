import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class135 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 696533307
	)
	int field1509;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class135(class119 var1) {
		this.this$0 = var1;
		this.field1509 = -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1509 = var1.readUnsignedShort();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2661(this.field1509);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Le;",
		garbageValue = "588193737"
	)
	public static class6[] method2797() {
		return new class6[]{class6.field14};
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method2795(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class317.field3854[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class317.field3854[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class317.field3854[(var6 & 15) << 2 | var7 >>> 6]).append(class317.field3854[var7 & 63]);
				} else {
					var3.append(class317.field3854[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class317.field3854[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lct;II)V",
		garbageValue = "-1430389228"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field1131 >= Client.cycle) {
			var2 = Math.max(1, var0.field1131 - Client.cycle);
			var3 = var0.field1087 * 1304956928 + var0.field1083 * 128;
			var4 = var0.field1087 * 1304956928 + var0.field1100 * 128;
			var0.x += (var3 - var0.x) / var2;
			var0.y += (var4 - var0.y) / var2;
			var0.field1085 = 0;
			var0.orientation = var0.field1133;
		} else if (var0.field1132 >= Client.cycle) {
			if (var0.field1132 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > MouseHandler.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
				var2 = var0.field1132 - var0.field1131;
				var3 = Client.cycle - var0.field1131;
				var4 = var0.field1087 * 1304956928 + var0.field1083 * 128;
				int var5 = var0.field1087 * 1304956928 + var0.field1100 * 128;
				int var6 = var0.field1087 * 1304956928 + var0.field1128 * 128;
				int var7 = var0.field1087 * 1304956928 + var0.field1130 * 128;
				var0.x = (var3 * var6 + var4 * (var2 - var3)) / var2;
				var0.y = (var3 * var7 + var5 * (var2 - var3)) / var2;
			}

			var0.field1085 = 0;
			var0.orientation = var0.field1133;
			var0.rotation = var0.orientation;
		} else {
			class138.method2836(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1131 = 0;
			var0.field1132 = 0;
			var0.x = var0.field1087 * 1304956928 + var0.pathX[0] * 128;
			var0.y = var0.pathY[0] * 128 + var0.field1087 * 1304956928;
			var0.method2165();
		}

		if (HealthBarDefinition.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1131 = 0;
			var0.field1132 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1087 * 1304956928;
			var0.y = var0.field1087 * 1304956928 + var0.pathY[0] * 128;
			var0.method2165();
		}

		WorldMapManager.method3814(var0);
		ClientPacket.method4709(var0);
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "([Ljf;II)V",
		garbageValue = "1696973469"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !Varcs.isComponentHidden(var3))) {
				if (var3.type == 0) {
					if (!var3.isIf3 && Varcs.isComponentHidden(var3) && var3 != WorldMapData_0.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						DirectByteArrayCopier.method5179(var4.group);
					}
				}

				if (var3.type == 6) {
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = class128.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = MouseHandler.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field531; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class184.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3165 != 0 && !var3.isIf3) {
						int var8 = var3.field3165 >> 16;
						var5 = var3.field3165 << 16 >> 16;
						var8 *= Client.field531;
						var5 *= Client.field531;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class184.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
