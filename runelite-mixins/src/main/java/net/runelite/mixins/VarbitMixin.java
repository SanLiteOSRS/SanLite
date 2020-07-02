package net.runelite.mixins;

import net.runelite.api.VarClientInt;
import net.runelite.api.VarClientStr;
import net.runelite.api.Varbits;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.Map;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSVarbitComposition;

@Mixin(RSClient.class)
public abstract class VarbitMixin implements RSClient
{
	private static final int VARBITS_GROUP = 14;

	@Shadow("client")
	private static RSClient client;

	@Inject
	private Cache<Integer, RSVarbitComposition> varbitCache = CacheBuilder.newBuilder()
			.maximumSize(128)
			.build();

	@Inject
	VarbitMixin()
	{
	}

	@Inject
	@Override
	public int getVar(Varbits varbit)
	{
		int varbitId = varbit.getId();
		return getVarbitValue(getVarps(), varbitId);
	}

	@Inject
	@Override
	public int getVarbitValue(int varbitId)
	{
		return getVarbitValue(getVarps(), varbitId);
	}

	@Inject
	@Override
	public void setVarbit(Varbits varbit, int value)
	{
		int varbitId = varbit.getId();
		setVarbitValue(getVarps(), varbitId, value);
	}

	@Inject
	@Override
	public RSVarbitComposition getVarbit(int id)
	{
		assert isClientThread();

		RSVarbitComposition varbit;
		varbit = varbitCache.getIfPresent(id);
		if (varbit != null)
		{
			return varbit;
		}
		varbit = (RSVarbitComposition) getVarbitCache().get(id);
		if (varbit != null && !(varbit.getIndex() == 0 && varbit.getMostSignificantBit() == 0 && varbit.getLeastSignificantBit() == 0))
		{
			return varbit;
		}

		byte[] fileData = getIndexConfig().getConfigData(VARBITS_GROUP, id);
		if (fileData == null)
		{
			return null;
		}
		varbit = createVarbitComposition();
		varbit.decode(createBuffer(fileData));
		return varbit;
	}

	@Inject
	@Override
	public int getVarbitValue(int[] varps, int varbitId)
	{
		assert client.isClientThread();

		RSVarbitComposition varbitComposition = getVarbit(varbitId);
		if (varbitComposition == null)
		{
			throw new IndexOutOfBoundsException(String.format("Varbit %d does not exist!", varbitId));
		}

		int value = varps[varbitComposition.getIndex()];
		int lsb = varbitComposition.getLeastSignificantBit();
		int msb = varbitComposition.getMostSignificantBit();
		int mask = (1 << ((msb - lsb) + 1)) - 1;
		return (value >> lsb) & mask;
	}

	@Inject
	@Override
	public void setVarbitValue(int[] varps, int varbitId, int value)
	{
		RSVarbitComposition varbitComposition = getVarbit(varbitId);
		if (varbitComposition == null)
		{
			throw new IndexOutOfBoundsException(String.format("Varbit %d does not exist!", varbitId));
		}

		int lsb = varbitComposition.getLeastSignificantBit();
		int msb = varbitComposition.getMostSignificantBit();
		int mask = (1 << ((msb - lsb) + 1)) - 1;
		varps[varbitComposition.getIndex()] = (varps[varbitComposition.getIndex()] & ~(mask << lsb)) | ((value & mask) << lsb);
	}

	@Inject
	@Override
	public int getVar(VarClientInt varClientInt)
	{
		return getVarcIntValue(varClientInt.getIndex());
	}

	@Inject
	@Override
	public int getVarcIntValue(int varcIntId)
	{
		Map<Integer, Object> varcmap = getVarcMap();
		Object object = varcmap.get(varcIntId);
		return object instanceof Integer ? (Integer) object : 0;
	}

	@Inject
	@Override
	public String getVar(VarClientStr varClientStr)
	{
		return getVarcStrValue(varClientStr.getIndex());
	}

	@Inject
	@Override
	public String getVarcStrValue(int varcStrId)
	{
		Map<Integer, Object> varcmap = getVarcMap();
		Object var2 = varcmap.get(varcStrId);
		return var2 instanceof String ? (String) var2 : "";
	}

	@Inject
	@Override
	public void setVar(VarClientStr varClientStr, String value)
	{
		Map<Integer, Object> varcmap = getVarcMap();
		varcmap.put(varClientStr.getIndex(), value);
	}

	@Inject
	@Override
	public void setVar(VarClientInt varClientInt, int value)
	{
		Map<Integer, Object> varcmap = getVarcMap();
		varcmap.put(varClientInt.getIndex(), value);
	}

	@Inject
	@Override
	public Map<Integer, Object> getVarcMap()
	{
		return getVarcs().getVarcMap();
	}
}
