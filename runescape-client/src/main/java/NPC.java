import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("musicTrack")
	static MusicTrack musicTrack;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IBB)V",
		garbageValue = "2"
	)
	final void method2254(int var1, byte var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && Player.SequenceDefinition_get(super.sequence).field1882 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? Player.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : Player.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					Model var4 = Friend.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1224, 0);
						Model[] var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "137252857"
	)
	final void method2267(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && Player.SequenceDefinition_get(super.sequence).field1882 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = 1;
				return;
			}
		}

		super.pathLength = 0;
		super.field1215 = 0;
		super.field1250 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1211 * 64 + super.pathX[0] * 128;
		super.y = super.field1211 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1701330496"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhk;",
		garbageValue = "1337289345"
	)
	static LoginPacket[] method2253() {
		return new LoginPacket[]{LoginPacket.field2803, LoginPacket.field2804, LoginPacket.field2798, LoginPacket.field2800, LoginPacket.field2801, LoginPacket.field2799};
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
		garbageValue = "16"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;B)V",
		garbageValue = "1"
	)
	public static void method2266(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}
}
