import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	static Buffer field1385;
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;I)I",
		garbageValue = "404985625"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Li;",
		garbageValue = "-1307073800"
	)
	public static class6[] method2583() {
		return new class6[]{class6.field19}; // L: 12
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-97"
	)
	static final void method2582(String var0) {
		PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2946, Client.packetWriter.isaacCipher); // L: 173
		var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0)); // L: 174
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 175
		Client.packetWriter.addNode(var1); // L: 176
	} // L: 177

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-2013251385"
	)
	static int method2575(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4663
			Nameable.Interpreter_intStackSize -= 5; // L: 4664
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4665
			return 1; // L: 4666
		} else if (var0 == 7204) { // L: 4668
			Nameable.Interpreter_intStackSize -= 6; // L: 4669
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4670
			return 1; // L: 4671
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4673
			Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1] = -1; // L: 4674
			return 1; // L: 4675
		} else if (var0 == 7209) { // L: 4677
			Nameable.Interpreter_intStackSize -= 2; // L: 4678
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4679
			return 1; // L: 4680
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4682
			--Nameable.Interpreter_intStackSize; // L: 4683
			return 1; // L: 4684
		} else if (var0 == 7214) { // L: 4686
			Nameable.Interpreter_intStackSize -= 2; // L: 4687
			return 1; // L: 4688
		} else {
			return 2; // L: 4690
		}
	}
}
