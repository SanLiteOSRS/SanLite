import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("tu")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -216933395
	)
	@Export("cacheGamebuild")
	public static int cacheGamebuild;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 1842635505
	)
	static int field30;
	@ObfuscatedName("f")
	boolean field31;
	@ObfuscatedName("e")
	boolean field21;
	@ObfuscatedName("v")
	@Export("members")
	public List members;
	@ObfuscatedName("y")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 1053094627222571429L
	)
	long field25;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("m")
	public byte field27;
	@ObfuscatedName("r")
	public byte field28;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field21 = true;
		this.name = null;
		this.method39(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-163030259"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).name;
			}

			int[] var3 = this.sortedMembers;
			class215.method4434(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ld;I)V",
		garbageValue = "1986125377"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-117"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "467541909"
	)
	public int method49() {
		return this.members.size();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1685723054"
	)
	public int method38(String var1) {
		if (!this.field21) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).name.equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1224796238"
	)
	void method39(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field31 = true;
		}

		if ((var2 & 2) != 0) {
			this.field21 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field25 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field28 = var1.readByte();
		this.field27 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field31) {
					var1.readLong();
				}

				if (this.field21) {
					var6.name = var1.readStringCp1252NullTerminated();
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnt;J)V"
	)
	static void method56(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2090430707"
	)
	static boolean method54() {
		return (Client.drawPlayerNames & 2) != 0;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1984819327"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = ItemContainer.getTileHeight(var0, var1, SoundSystem.Client_plane) - var2;
			var0 -= ObjectSound.cameraX;
			var3 -= class160.cameraY;
			var1 -= Canvas.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[class69.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class69.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[class32.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class32.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var3 * var5 - var4 * var1 >> 16;
			var1 = var5 * var1 + var4 * var3 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
