import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class14 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -671093253
	)
	final int field76;
	@ObfuscatedName("ae")
	final String field72;
	@ObfuscatedName("ao")
	final ThreadFactory field74;
	@ObfuscatedName("at")
	final ThreadPoolExecutor field73;

	public class14(String var1, int var2, int var3) {
		this.field72 = var1; // L: 15
		this.field76 = var2; // L: 16
		this.field74 = new class16(this); // L: 17
		this.field73 = this.method162(var3); // L: 18
	} // L: 19

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-56"
	)
	final ThreadPoolExecutor method162(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field76), this.field74); // L: 22
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lad;B)Lax;",
		garbageValue = "19"
	)
	public class18 method165(class10 var1) {
		if (this.field73.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field73.getCorePoolSize() + " Queue capacity " + this.field76); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field73.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2032063402"
	)
	public final void method173() {
		try {
			this.field73.shutdown();
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lsf;III)I",
		garbageValue = "-1229342893"
	)
	static int method163(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-525651527"
	)
	static void method175(int var0, String var1) {
		int var2 = Players.Players_count; // L: 10037
		int[] var3 = Players.Players_indices; // L: 10038
		boolean var4 = false; // L: 10039
		Username var5 = new Username(var1, Language.loginType); // L: 10040

		for (int var6 = 0; var6 < var2; ++var6) { // L: 10041
			Player var7 = Client.players[var3[var6]]; // L: 10042
			if (var7 != null && var7 != VarbitComposition.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 10043
				PacketBufferNode var8;
				if (var0 == 1) { // L: 10044
					var8 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher); // L: 10046
					var8.packetBuffer.method9098(var3[var6]); // L: 10047
					var8.packetBuffer.method9110(0); // L: 10048
					Client.packetWriter.addNode(var8); // L: 10049
				} else if (var0 == 4) { // L: 10051
					var8 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher); // L: 10053
					var8.packetBuffer.method9213(var3[var6]); // L: 10054
					var8.packetBuffer.method9291(0); // L: 10055
					Client.packetWriter.addNode(var8); // L: 10056
				} else if (var0 == 6) { // L: 10058
					var8 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher); // L: 10060
					var8.packetBuffer.method9213(var3[var6]); // L: 10061
					var8.packetBuffer.method9110(0); // L: 10062
					Client.packetWriter.addNode(var8); // L: 10063
				} else if (var0 == 7) { // L: 10065
					var8 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher); // L: 10067
					var8.packetBuffer.method9239(var3[var6]); // L: 10068
					var8.packetBuffer.writeByte(0); // L: 10069
					Client.packetWriter.addNode(var8); // L: 10070
				}

				var4 = true; // L: 10072
				break;
			}
		}

		if (!var4) { // L: 10076
			MouseHandler.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 10077

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-539103842"
	)
	static final String method176(int var0, int var1) {
		int var2 = var1 - var0; // L: 10535
		if (var2 < -9) { // L: 10536
			return class217.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 10537
			return class217.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 10538
			return class217.colorStartTag(16740352);
		} else if (var2 < 0) { // L: 10539
			return class217.colorStartTag(16756736);
		} else if (var2 > 9) { // L: 10540
			return class217.colorStartTag(65280);
		} else if (var2 > 6) { // L: 10541
			return class217.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 10542
			return class217.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class217.colorStartTag(12648192) : class217.colorStartTag(16776960); // L: 10543 10544
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-26"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11414
	} // L: 11415

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-361779527"
	)
	static final void method161(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12280
		class449.clientPreferences.method2556(var0); // L: 12281
	} // L: 12282
}
