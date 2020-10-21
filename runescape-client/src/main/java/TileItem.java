import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 652464565
	)
	@Export("id")
	int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 417363545
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	@Export("getModel")
	protected final Model getModel() {
		return GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)Lhq;",
		garbageValue = "7632896"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = WorldMapSprite.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IB)Lld;",
		garbageValue = "86"
	)
	public static PrivateChatMode method2202(int var0) {
		PrivateChatMode[] var1 = SpotAnimationDefinition.method4518();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field3824) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(CLgn;I)C",
		garbageValue = "-2022621554"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

	@ObfuscatedName("t")
	public static int method2209(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "1"
	)
	static final int method2206(int var0, int var1) {
		int var2 = GrandExchangeOfferOwnWorldComparator.method1334(var0 - 1, var1 - 1) + GrandExchangeOfferOwnWorldComparator.method1334(var0 + 1, var1 - 1) + GrandExchangeOfferOwnWorldComparator.method1334(var0 - 1, 1 + var1) + GrandExchangeOfferOwnWorldComparator.method1334(var0 + 1, var1 + 1);
		int var3 = GrandExchangeOfferOwnWorldComparator.method1334(var0 - 1, var1) + GrandExchangeOfferOwnWorldComparator.method1334(1 + var0, var1) + GrandExchangeOfferOwnWorldComparator.method1334(var0, var1 - 1) + GrandExchangeOfferOwnWorldComparator.method1334(var0, var1 + 1);
		int var4 = GrandExchangeOfferOwnWorldComparator.method1334(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lfo;III)Ldr;",
		garbageValue = "-1837543032"
	)
	public static final PcmPlayer method2205(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field1447 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class300.pcmPlayerProvider.player();
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
				var3.field1438 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (Decimator.field1491 > 0 && class1.soundSystem == null) {
					class1.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class1.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class1.soundSystem != null) {
					if (class1.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					class1.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "41"
	)
	static boolean method2208() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
