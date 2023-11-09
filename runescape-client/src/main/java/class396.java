import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class396 {
	@ObfuscatedName("at")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	class392 field4481;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -528304343
	)
	int field4479;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1654832851
	)
	int field4480;

	@ObfuscatedSignature(
		descriptor = "(Lpf;II)V"
	)
	class396(class392 var1, int var2, int var3) {
		this.field4479 = 0; // L: 7
		this.field4480 = 0; // L: 8
		this.field4481 = var1; // L: 11
		this.field4479 = var2; // L: 12
		this.field4480 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "69345948"
	)
	public String method7529() {
		if (this.method7516()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7526()); // L: 18

			for (int var2 = this.field4479; var2 < this.field4480; ++var2) { // L: 19
				class394 var3 = this.field4481.method7252(var2); // L: 20
				var1.append(var3.field4454); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-42"
	)
	boolean method7527(int var1) {
		return this.field4481.method7309() == 2 || this.field4481.method7309() == 1 && (!this.field4481.field4442 || this.field4480 - 1 != var1); // L: 27
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "137284836"
	)
	public boolean method7516() {
		return this.field4479 == this.field4480; // L: 31
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-722444457"
	)
	public int method7526() {
		return this.field4480 - this.field4479; // L: 35
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpy;I)Z",
		garbageValue = "817094663"
	)
	boolean method7505(class394 var1) {
		if (this.field4481.field4446 == 2) { // L: 39
			return true;
		} else if (this.field4481.field4446 == 0) { // L: 40
			return false;
		} else {
			return this.field4481.method7284() != var1; // L: 41
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-375520380"
	)
	int method7533() {
		if (this.method7516()) { // L: 46
			return 0;
		} else {
			class394 var1 = this.field4481.method7252(this.field4480 - 1); // L: 47
			if (var1.field4454 == '\n') { // L: 48
				return 0;
			} else if (this.method7505(var1)) {
				return this.field4481.field4432.advances[42]; // L: 49
			} else {
				int var2 = this.field4481.field4432.advances[var1.field4454]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4454 == '\t' ? this.field4481.field4432.advances[32] * 3 : this.field4481.field4432.advances[32]; // L: 52 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lsk;",
		garbageValue = "-110"
	)
	public class473 method7512() {
		if (this.method7516()) { // L: 65
			return new class473(0, 0); // L: 66
		} else {
			class394 var1 = this.field4481.method7252(this.field4480 - 1); // L: 68
			return new class473(var1.field4451 + this.method7533(), var1.field4455); // L: 69
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lpy;",
		garbageValue = "-1160716106"
	)
	public class394 method7528(int var1) {
		return var1 >= 0 && var1 < this.method7526() ? this.field4481.method7252(this.field4479 + var1) : null; // L: 73 74
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "11"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1989954025"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3836
			WorldMapManager.clientPreferences.method2426(!WorldMapManager.clientPreferences.method2536()); // L: 3837
			if (WorldMapManager.clientPreferences.method2536()) { // L: 3838
				HealthBarUpdate.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3839
			} else {
				HealthBarUpdate.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3842
			}
		}

		if (var0.startsWith("zbuf")) { // L: 3845
			boolean var1 = VarbitComposition.method3780(var0.substring(5).trim()) == 1; // L: 3846
			class439.client.method489(var1); // L: 3847
			Rasterizer3D.method4354(var1); // L: 3848
		}

		if (var0.equalsIgnoreCase("z")) { // L: 3850
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3851
			WorldMapManager.clientPreferences.method2433();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3852
			Client.field503 = !Client.field503;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3853
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3854
			if (var0.equalsIgnoreCase("errortest")) { // L: 3855
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				ScriptEvent.worldMap.showCoord = !ScriptEvent.worldMap.showCoord; // L: 3856
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3857
				WorldMapManager.clientPreferences.method2432(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3858
				WorldMapManager.clientPreferences.method2432(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3859
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3860
				class492.method8853();
			}
		}

		PacketBufferNode var2 = class251.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 3863
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 3864
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3865
		Client.packetWriter.addNode(var2); // L: 3866
	} // L: 3867
}
