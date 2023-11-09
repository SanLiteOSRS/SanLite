import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class152 extends class143 {
	@ObfuscatedName("ac")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	static SpritePixels[] field1717;
	@ObfuscatedName("au")
	String field1716;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class152(class146 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1716 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.name = this.field1716; // L: 237
	} // L: 238

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;I)V",
		garbageValue = "185699180"
	)
	public static void method3168(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0; // L: 30
		class422.field4609 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILhv;II)V",
		garbageValue = "1173683624"
	)
	static void method3167(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 68
		var5.plane = var0; // L: 69
		var5.x = var1 * 128; // L: 70
		var5.y = var2 * 128; // L: 71
		int var6 = var3.sizeX; // L: 72
		int var7 = var3.sizeY; // L: 73
		if (var4 == 1 || var4 == 3) { // L: 74
			var6 = var3.sizeY; // L: 75
			var7 = var3.sizeX; // L: 76
		}

		var5.maxX = (var6 + var1) * 128; // L: 78
		var5.maxY = (var7 + var2) * 128; // L: 79
		var5.soundEffectId = var3.ambientSoundId; // L: 80
		var5.field861 = var3.int7 * 128; // L: 81
		var5.field867 = var3.int5; // L: 82
		var5.field865 = var3.int6; // L: 83
		var5.soundEffectIds = var3.soundEffectIds; // L: 84
		if (var3.transforms != null) { // L: 85
			var5.obj = var3; // L: 86
			var5.set(); // L: 87
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 89
		if (var5.soundEffectIds != null) { // L: 90
			var5.field875 = var5.field867 + (int)(Math.random() * (double)(var5.field865 - var5.field867));
		}

	} // L: 91

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "([Lmi;II)V",
		garbageValue = "-73715708"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12148
			Widget var3 = var0[var2]; // L: 12149
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class143.isComponentHidden(var3))) { // L: 12150 12151 12152
				int var5;
				if (var3.type == 0) { // L: 12153
					if (!var3.isIf3 && class143.isComponentHidden(var3) && var3 != class146.mousedOverWidgetIf1) { // L: 12154
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12155
					if (var3.children != null) { // L: 12156
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12157
					if (var4 != null) { // L: 12158
						var5 = var4.group; // L: 12159
						if (ModeWhere.loadInterface(var5)) { // L: 12161
							drawModelComponents(PacketBufferNode.Widget_interfaceComponents[var5], -1); // L: 12162
						}
					}
				}

				if (var3.type == 6) { // L: 12166
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12167
						boolean var8 = class27.runCs1(var3); // L: 12168
						if (var8) { // L: 12170
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12171
						}

						if (var5 != -1) { // L: 12172
							SequenceDefinition var6 = EnumComposition.SequenceDefinition_get(var5); // L: 12173
							if (!var6.isCachedModelIdSet()) { // L: 12174
								for (var3.modelFrameCycle += Client.field605; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class218.invalidateWidget(var3)) { // L: 12175 12176 12183
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12177
									++var3.modelFrame; // L: 12178
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12179
										var3.modelFrame -= var6.frameCount; // L: 12180
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12181
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field605; // L: 12187
								int var7 = var6.method4034(); // L: 12188
								if (var3.modelFrame >= var7) { // L: 12189
									var3.modelFrame -= var6.frameCount; // L: 12190
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12191
										var3.modelFrame = 0;
									}
								}

								class218.invalidateWidget(var3); // L: 12193
							}
						}
					}

					if (var3.field3741 != 0 && !var3.isIf3) { // L: 12197
						int var9 = var3.field3741 >> 16; // L: 12198
						var5 = var3.field3741 << 16 >> 16; // L: 12199
						var9 *= Client.field605; // L: 12200
						var5 *= Client.field605; // L: 12201
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12202
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12203
						class218.invalidateWidget(var3); // L: 12204
					}
				}
			}
		}

	} // L: 12208
}
