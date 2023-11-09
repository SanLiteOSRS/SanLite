import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;

	ApproximateRouteStrategy() {
	} // L: 12907

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIILic;B)Z",
		garbageValue = "-38"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12911
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-2089408122"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 27
		if (var4 == null) { // L: 28
			var4 = new ChatChannel(); // L: 29
			Messages.Messages_channels.put(var0, var4); // L: 30
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 32
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 33
		Messages.Messages_queue.add(var5); // L: 34
		Client.chatCycle = Client.cycleCntr; // L: 35
	} // L: 36

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1102055523"
	)
	static final void method1186(int var0, int var1, int var2) {
		if (class208.cameraX < var0) { // L: 3951
			class208.cameraX = (var0 - class208.cameraX) * LoginScreenAnimation.field1255 / 1000 + class208.cameraX + UserComparator4.field1410; // L: 3952
			if (class208.cameraX > var0) { // L: 3953
				class208.cameraX = var0;
			}
		}

		if (class208.cameraX > var0) { // L: 3955
			class208.cameraX -= (class208.cameraX - var0) * LoginScreenAnimation.field1255 / 1000 + UserComparator4.field1410; // L: 3956
			if (class208.cameraX < var0) { // L: 3957
				class208.cameraX = var0;
			}
		}

		if (class152.cameraY < var1) { // L: 3959
			class152.cameraY = (var1 - class152.cameraY) * LoginScreenAnimation.field1255 / 1000 + class152.cameraY + UserComparator4.field1410; // L: 3960
			if (class152.cameraY > var1) { // L: 3961
				class152.cameraY = var1;
			}
		}

		if (class152.cameraY > var1) { // L: 3963
			class152.cameraY -= (class152.cameraY - var1) * LoginScreenAnimation.field1255 / 1000 + UserComparator4.field1410; // L: 3964
			if (class152.cameraY < var1) { // L: 3965
				class152.cameraY = var1;
			}
		}

		if (ByteArrayPool.cameraZ < var2) { // L: 3967
			ByteArrayPool.cameraZ = (var2 - ByteArrayPool.cameraZ) * LoginScreenAnimation.field1255 / 1000 + ByteArrayPool.cameraZ + UserComparator4.field1410; // L: 3968
			if (ByteArrayPool.cameraZ > var2) { // L: 3969
				ByteArrayPool.cameraZ = var2;
			}
		}

		if (ByteArrayPool.cameraZ > var2) { // L: 3971
			ByteArrayPool.cameraZ -= (ByteArrayPool.cameraZ - var2) * LoginScreenAnimation.field1255 / 1000 + UserComparator4.field1410; // L: 3972
			if (ByteArrayPool.cameraZ < var2) { // L: 3973
				ByteArrayPool.cameraZ = var2;
			}
		}

	} // L: 3975
}
