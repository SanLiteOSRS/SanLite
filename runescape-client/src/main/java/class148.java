import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class148 extends class139 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Ltc;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("af")
	String field1700;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;)V"
	)
	class148(class142 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "168736686"
	)
	void vmethod3461(Buffer var1) {
		this.field1700 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V",
		garbageValue = "1712319228"
	)
	void vmethod3458(ClanSettings var1) {
		var1.name = this.field1700; // L: 237
	} // L: 238

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhx;",
		garbageValue = "15"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lgv;",
		garbageValue = "450057476"
	)
	public static Clock method3284() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lgd;III)Lbu;",
		garbageValue = "1831095645"
	)
	public static final PcmPlayer method3290(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field306 * -1110828124 == 0) { // L: 45
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 46
			if (var2 < 256) { // L: 47
				var2 = 256;
			}

			try {
				PcmPlayer var3 = PcmPlayer.pcmPlayerProvider.player(); // L: 49
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 50
				var3.field305 = var2; // L: 51
				var3.init(); // L: 52
				var3.capacity = (var2 & -1024) + 1024; // L: 53
				if (var3.capacity > 16384) { // L: 54
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 55
				if (UrlRequest.field1410 > 0 && class354.soundSystem == null) { // L: 56
					class354.soundSystem = new SoundSystem(); // L: 57
					SoundSystem.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 58
					SoundSystem.soundSystemExecutor.scheduleAtFixedRate(class354.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 59
				}

				if (class354.soundSystem != null) { // L: 61
					if (class354.soundSystem.players[var1] != null) { // L: 62
						throw new IllegalArgumentException();
					}

					class354.soundSystem.players[var1] = var3; // L: 63
				}

				return var3; // L: 65
			} catch (Throwable var4) { // L: 67
				return new PcmPlayer(); // L: 68
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1480705530"
	)
	static final void method3291() {
		PacketBufferNode var0 = class330.getPacketBufferNode(ClientPacket.field3166, Client.packetWriter.isaacCipher); // L: 11774
		Client.packetWriter.addNode(var0); // L: 11775
		Interpreter.field853 = true; // L: 11776

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11777
			if (var1.type == 0 || var1.type == 3) { // L: 11778
				class357.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11780
			class144.invalidateWidget(Client.meslayerContinueWidget); // L: 11781
			Client.meslayerContinueWidget = null; // L: 11782
		}

		Interpreter.field853 = false; // L: 11784
	} // L: 11785
}
