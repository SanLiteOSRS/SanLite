import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 294057057
	)
	static int field981;
	@ObfuscatedName("ai")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("aj")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1418240397"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2020295041"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "2003383793"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) { // L: 30
			SecureRandom var3 = new SecureRandom(); // L: 33
			var3.nextInt(); // L: 34
			return var3; // L: 37
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;I)V",
		garbageValue = "-1368865092"
	)
	public static void method2170(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "363508089"
	)
	public static boolean method2177(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-569449666"
	)
	static final boolean method2174(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 197
		Buffer var4 = new Buffer(var0); // L: 198
		int var5 = -1; // L: 199

		label69:
		while (true) {
			int var6 = var4.method9075(); // L: 201
			if (var6 == 0) { // L: 202
				return var3; // L: 233
			}

			var5 += var6; // L: 203
			int var7 = 0; // L: 204
			boolean var8 = false; // L: 205

			while (true) {
				int var9;
				while (!var8) { // L: 207
					var9 = var4.readUShortSmart(); // L: 213
					if (var9 == 0) { // L: 214
						continue label69;
					}

					var7 += var9 - 1; // L: 215
					int var10 = var7 & 63; // L: 216
					int var11 = var7 >> 6 & 63; // L: 217
					int var12 = var4.readUnsignedByte() >> 2; // L: 218
					int var13 = var11 + var1; // L: 219
					int var14 = var10 + var2; // L: 220
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 221
						ObjectComposition var15 = Language.getObjectDefinition(var5); // L: 222
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 223
							if (!var15.needsModelFiles()) { // L: 224
								++Client.field568; // L: 225
								var3 = false; // L: 226
							}

							var8 = true; // L: 228
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 208
				if (var9 == 0) { // L: 209
					break;
				}

				var4.readUnsignedByte(); // L: 210
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2146777174"
	)
	static int method2173(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 63
		if (var1 == null) { // L: 64
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 65 66
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1434254557"
	)
	static final void method2179(String var0) {
		PacketBufferNode var1 = class217.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher); // L: 159
		var1.packetBuffer.writeByte(Player.stringCp1252NullTerminatedByteSize(var0)); // L: 160
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 161
		Client.packetWriter.addNode(var1); // L: 162
	} // L: 163

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-566208024"
	)
	static void method2172() {
		for (class211 var0 = (class211)Client.field584.last(); var0 != null; var0 = (class211)Client.field584.previous()) { // L: 5207
			var0.remove(); // L: 5208
		}

	} // L: 5210

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "([Lme;IIIZS)V",
		garbageValue = "30638"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 11066
			Widget var6 = var0[var5]; // L: 11067
			if (var6 != null && var6.parentId == var1) { // L: 11068 11069
				UserComparator4.alignWidgetSize(var6, var2, var3, var4); // L: 11070
				class211.alignWidgetPosition(var6, var2, var3); // L: 11071
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 11072
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 11073
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height; // L: 11074
				}

				if (var6.scrollY < 0) { // L: 11075
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 11076
					class238.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 11078
}
