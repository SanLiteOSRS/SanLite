import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class3 extends Node {
	@ObfuscatedName("f")
	boolean field32;
	@ObfuscatedName("o")
	boolean field28;
	@ObfuscatedName("u")
	public List field27;
	@ObfuscatedName("p")
	int[] field26;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -1941040478688565745L
	)
	long field29;
	@ObfuscatedName("e")
	public String field25;
	@ObfuscatedName("k")
	public byte field31;
	@ObfuscatedName("g")
	public byte field30;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		signature = "(Lnu;)V"
	)
	public class3(Buffer var1) {
		this.field28 = true;
		this.field25 = null;
		this.method48(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)[I",
		garbageValue = "28"
	)
	public int[] method44() {
		if (this.field26 == null) {
			String[] var1 = new String[this.field27.size()];
			this.field26 = new int[this.field27.size()];

			for (int var2 = 0; var2 < this.field27.size(); this.field26[var2] = var2++) {
				var1[var2] = ((class9)this.field27.get(var2)).field65;
			}

			int[] var3 = this.field26;
			GrandExchangeOffer.method4633(var1, var3, 0, var1.length - 1);
		}

		return this.field26;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ln;I)V",
		garbageValue = "-1218707002"
	)
	void method61(class9 var1) {
		this.field27.add(var1);
		this.field26 = null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "525783356"
	)
	void method45(int var1) {
		this.field27.remove(var1);
		this.field26 = null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "77686460"
	)
	public int method46() {
		return this.field27.size();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)I",
		garbageValue = "-59"
	)
	public int method43(String var1) {
		if (!this.field28) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.field27.size(); ++var2) {
				if (((class9)this.field27.get(var2)).field65.equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "1242419258"
	)
	void method48(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field32 = true;
		}

		if ((var2 & 2) != 0) {
			this.field28 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field29 = var1.readLong();
		this.field25 = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field30 = var1.readByte();
		this.field31 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.field27 = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				class9 var6 = new class9();
				if (this.field32) {
					var1.readLong();
				}

				if (this.field28) {
					var6.field65 = var1.readStringCp1252NullTerminated();
				}

				var6.field66 = var1.readByte();
				var6.field64 = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.field27.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ldt;III)Lbh;",
		garbageValue = "484099041"
	)
	public static final PcmPlayer method57(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field394 * 22050 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class301.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field395 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (Frames.field2007 > 0 && class0.soundSystem == null) {
					class0.soundSystem = new SoundSystem();
					class34.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					class34.soundSystemExecutor.scheduleAtFixedRate(class0.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class0.soundSystem != null) {
					if (class0.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					class0.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "2105009881"
	)
	static boolean method63() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
