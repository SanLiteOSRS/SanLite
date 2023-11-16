import java.util.Arrays;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class18 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1288987617
	)
	static int field88;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -125616841
	)
	static int field85;
	@ObfuscatedName("at")
	Future field86;
	@ObfuscatedName("ah")
	String field84;

	class18(Future var1) {
		this.field86 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method265(var1); // L: 14
	} // L: 15

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-556763021"
	)
	void method265(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field84 = var1;
		if (this.field86 != null) {
			this.field86.cancel(true); // L: 21
			this.field86 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "94"
	)
	public final String method264() {
		return this.field84; // L: 27
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-712544099"
	)
	public boolean method267() {
		return this.field84 != null || this.field86 == null; // L: 31
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "66"
	)
	public final boolean method283() {
		return this.method267() ? true : this.field86.isDone(); // L: 35 36
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Law;",
		garbageValue = "-42"
	)
	public final class20 method269() {
		if (this.method267()) { // L: 40
			return new class20(this.field84);
		} else if (!this.method283()) { // L: 41
			return null;
		} else {
			try {
				return (class20)this.field86.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method265(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V",
		garbageValue = "1722301374"
	)
	public static void method288(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnb;ZI)V",
		garbageValue = "-940953937"
	)
	public static void method290(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 1041
		var0.field3717 = new PlayerComposition(var1); // L: 1042
		if (!var2) { // L: 1043
			var0.field3717.equipment = Arrays.copyOf(var0.field3717.field3596, var0.field3717.field3596.length); // L: 1044
			var0.field3717.method6323(); // L: 1045
		}

	} // L: 1047

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lnn;III)V",
		garbageValue = "-1252967897"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3817
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3818
				SpriteMask var3 = var0.method6668(HealthBarDefinition.field1877, true); // L: 3819
				if (var3 == null) { // L: 3820
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3821
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3822
				if (var3.contains(var4, var5)) { // L: 3823
					var4 -= var3.width / 2; // L: 3824
					var5 -= var3.height / 2; // L: 3825
					int var6 = Client.camAngleY & 2047; // L: 3826
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3827
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3828
					int var9 = var4 * var8 + var5 * var7 >> 11; // L: 3829
					int var10 = var5 * var8 - var7 * var4 >> 11; // L: 3830
					int var11 = var9 + class229.localPlayer.x >> 7; // L: 3831
					int var12 = class229.localPlayer.y - var10 >> 7; // L: 3832
					PacketBufferNode var13 = class113.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher); // L: 3834
					var13.packetBuffer.writeByte(18); // L: 3835
					var13.packetBuffer.writeShort(class187.baseX * 64 + var11); // L: 3836
					var13.packetBuffer.method9299(class101.baseY * 64 + var12); // L: 3837
					var13.packetBuffer.method9292(Client.field724.method4316(82) ? (Client.field724.method4316(81) ? 2 : 1) : 0); // L: 3838
					var13.packetBuffer.writeByte(var4); // L: 3839
					var13.packetBuffer.writeByte(var5); // L: 3840
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3841
					var13.packetBuffer.writeByte(57); // L: 3842
					var13.packetBuffer.writeByte(0); // L: 3843
					var13.packetBuffer.writeByte(0); // L: 3844
					var13.packetBuffer.writeByte(89); // L: 3845
					var13.packetBuffer.writeShort(class229.localPlayer.x); // L: 3846
					var13.packetBuffer.writeShort(class229.localPlayer.y); // L: 3847
					var13.packetBuffer.writeByte(63); // L: 3848
					Client.packetWriter.addNode(var13); // L: 3849
					Client.destinationX = var11; // L: 3850
					Client.destinationY = var12; // L: 3851
				}
			}

		}
	} // L: 3854

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-805283190"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 5048
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 5049
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 5050
				int var3 = var2.x >> 7; // L: 5051
				int var4 = var2.y >> 7; // L: 5052
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 5053
					if (var2.field1198 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 5054
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 5055
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 5056
					}

					long var5 = Player.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 5058
					var2.playerCycle = Client.cycle; // L: 5059
					class36.scene.drawEntity(ItemLayer.Client_plane, var2.x, var2.y, WorldMapDecorationType.getTileHeight(var2.field1198 * 64 - 64 + var2.x, var2.field1198 * 64 - 64 + var2.y, ItemLayer.Client_plane), var2.field1198 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 5060
				}
			}
		}

	} // L: 5064
}
