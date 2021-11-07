import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class7 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("i")
	ExecutorService field17;
	@ObfuscatedName("w")
	Future field20;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	final Buffer field18;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class3 field19;

	@ObfuscatedSignature(
		descriptor = "(Lop;La;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field17 = Executors.newSingleThreadExecutor();
		this.field18 = var1;
		this.field19 = var2;
		this.method49();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "830393061"
	)
	public boolean method46() {
		return this.field20.isDone();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1036380916"
	)
	public void method47() {
		this.field17.shutdown();
		this.field17 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lop;",
		garbageValue = "945217619"
	)
	public Buffer method48() {
		try {
			return (Buffer)this.field20.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1187826160"
	)
	void method49() {
		this.field20 = this.field17.submit(new class1(this, this.field18, this.field19));
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1545852128"
	)
	public static int[] method57() {
		int[] var0 = new int[KeyHandler.field110];

		for (int var1 = 0; var1 < KeyHandler.field110; ++var1) {
			var0[var1] = KeyHandler.field125[var1];
		}

		return var0;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "77"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class408.clientPreferences.roofsHidden = !class408.clientPreferences.roofsHidden;
			Login.savePreferences();
			if (class408.clientPreferences.roofsHidden) {
				class397.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class397.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class133.worldMap.showCoord = !class133.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				Clock.method2960();
			}
		}

		PacketBufferNode var1 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2721, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
