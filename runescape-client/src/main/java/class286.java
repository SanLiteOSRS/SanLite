import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public class class286 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class286 field3684;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class286 field3687;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class286 field3686;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1228453663
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;

	static {
		field3684 = new class286();
		field3687 = new class286();
		field3686 = new class286();
	}

	class286() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "4"
	)
	static int method5056(int var0, Script var1, boolean var2) {
		if (var0 == 3800) {
			if (class105.field1328 != null) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
				ArchiveDiskActionHandler.field3575 = class105.field1328;
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == 3801) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				if (Client.field678[var3] != null) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
					ArchiveDiskActionHandler.field3575 = Client.field678[var3];
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.field3575.field91;
				return 1;
			} else if (var0 == 3803) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field93 ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field111;
				return 1;
			} else if (var0 == 3805) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field95;
				return 1;
			} else if (var0 == 3806) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field96;
				return 1;
			} else if (var0 == 3807) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field113;
				return 1;
			} else if (var0 == 3809) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field98;
				return 1;
			} else if (var0 == 3810) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.field3575.field109[var3];
				return 1;
			} else if (var0 == 3811) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field100[var3];
				return 1;
			} else if (var0 == 3812) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field107;
				return 1;
			} else if (var0 == 3813) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.field3575.field101[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == 3814) {
					WorldMapCacheName.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.method114(var3, var6, var5);
					return 1;
				} else if (var0 == 3815) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field105;
					return 1;
				} else if (var0 == 3816) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field106;
					return 1;
				} else if (var0 == 3817) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.method113(Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == 3818) {
					Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.method167()[Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == 3819) {
					WorldMapCacheName.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
					class310.method5485(var6, var3);
					return 1;
				} else if (var0 == 3820) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field94[var3];
					return 1;
				} else {
					if (var0 == 3821) {
						WorldMapCacheName.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
						SoundCache.method869(var5, var3, var4);
					}

					if (var0 == 3822) {
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field104[var3] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (Players.field1358 != null) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
							Canvas.field292 = Players.field1358;
						} else {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						if (Client.field847[var3] != null) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
							Canvas.field292 = Client.field847[var3];
							ModelData0.field2510 = var3;
						} else {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Canvas.field292.field38;
						return 1;
					} else if (var0 == 3853) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.field37;
						return 1;
					} else if (var0 == 3854) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.field36;
						return 1;
					} else if (var0 == 3855) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.method39();
						return 1;
					} else if (var0 == 3856) {
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ((class9)Canvas.field292.field32.get(var3)).field73;
						return 1;
					} else if (var0 == 3857) {
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((class9)Canvas.field292.field32.get(var3)).field76;
						return 1;
					} else if (var0 == 3858) {
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((class9)Canvas.field292.field32.get(var3)).field80;
						return 1;
					} else if (var0 == 3859) {
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						FriendLoginUpdate.method5553(ModelData0.field2510, var3);
						return 1;
					} else if (var0 == 3860) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.method34(Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == 3861) {
						Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.method31()[Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == 3890) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ObjectSound.field935 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
