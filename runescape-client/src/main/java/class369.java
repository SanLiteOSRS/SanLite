import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public class class369 extends class340 implements class216 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	final AbstractArchive field4130;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	final DemotingHashTable field4129;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1767645643
	)
	final int field4128;

	@ObfuscatedSignature(
		descriptor = "(Ljr;ILkr;Ljp;)V"
	)
	public class369(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4129 = new DemotingHashTable(64);
		this.field4130 = var4;
		this.field4128 = var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lmi;",
		garbageValue = "1012040544"
	)
	protected class342 vmethod6308(int var1) {
		synchronized(this.field4129) {
			class341 var2 = (class341)this.field4129.get((long)var1);
			if (var2 == null) {
				var2 = this.method6301(var1);
				this.field4129.method4249(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmr;",
		garbageValue = "16"
	)
	class341 method6301(int var1) {
		byte[] var2 = this.field4130.takeFile(this.field4128, var1);
		class341 var3 = new class341(var1);
		if (var2 != null) {
			var3.method5879(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "107737702"
	)
	public void method6309() {
		synchronized(this.field4129) {
			this.field4129.clear();
		}
	}

	public Iterator iterator() {
		return new class368(this);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "76"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "-1321837262"
	)
	static final void method6314(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1250 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = Player.SequenceDefinition_get(var0.sequence);
				if (var0.field1215 > 0 && var1.field1886 == 0) {
					++var0.field1250;
					return;
				}

				if (var0.field1215 <= 0 && var1.field1882 == 0) {
					++var0.field1250;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1211 * 64;
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1211 * 64;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1261 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1250 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1250;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1250 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1250;
					}
				}

				if (var5 == 2) {
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var4 != var2) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1215 > 0) {
						--var0.field1215;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1215 > 0) {
					--var0.field1215;
				}

			}
		}
	}
}
