
package org.mule.modules.slack.processors;

import java.io.InputStream;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.modules.slack.SlackConnector;
import org.mule.modules.slack.client.model.file.FileUploadResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * UploadFileAsInputStreamsMessageProcessor invokes the {@link org.mule.modules.slack.SlackConnector#uploadFileAsInputStreams(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.io.InputStream)} method in {@link SlackConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.6.1", date = "2015-08-26T07:19:14-03:00", comments = "Build UNNAMED.2405.44720b7")
public class UploadFileAsInputStreamsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object channelID;
    protected String _channelIDType;
    protected Object fileName;
    protected String _fileNameType;
    protected Object fileType;
    protected String _fileTypeType;
    protected Object title;
    protected String _titleType;
    protected Object initialComment;
    protected String _initialCommentType;
    protected Object inputStream;
    protected InputStream _inputStreamType;

    public UploadFileAsInputStreamsMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets title
     * 
     * @param value Value to set
     */
    public void setTitle(Object value) {
        this.title = value;
    }

    /**
     * Sets fileType
     * 
     * @param value Value to set
     */
    public void setFileType(Object value) {
        this.fileType = value;
    }

    /**
     * Sets inputStream
     * 
     * @param value Value to set
     */
    public void setInputStream(Object value) {
        this.inputStream = value;
    }

    /**
     * Sets initialComment
     * 
     * @param value Value to set
     */
    public void setInitialComment(Object value) {
        this.initialComment = value;
    }

    /**
     * Sets channelID
     * 
     * @param value Value to set
     */
    public void setChannelID(Object value) {
        this.channelID = value;
    }

    /**
     * Sets fileName
     * 
     * @param value Value to set
     */
    public void setFileName(Object value) {
        this.fileName = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(null, false, event);
            final String _transformedChannelID = ((String) evaluateAndTransform(getMuleContext(), event, UploadFileAsInputStreamsMessageProcessor.class.getDeclaredField("_channelIDType").getGenericType(), null, channelID));
            final String _transformedFileName = ((String) evaluateAndTransform(getMuleContext(), event, UploadFileAsInputStreamsMessageProcessor.class.getDeclaredField("_fileNameType").getGenericType(), null, fileName));
            final String _transformedFileType = ((String) evaluateAndTransform(getMuleContext(), event, UploadFileAsInputStreamsMessageProcessor.class.getDeclaredField("_fileTypeType").getGenericType(), null, fileType));
            final String _transformedTitle = ((String) evaluateAndTransform(getMuleContext(), event, UploadFileAsInputStreamsMessageProcessor.class.getDeclaredField("_titleType").getGenericType(), null, title));
            final String _transformedInitialComment = ((String) evaluateAndTransform(getMuleContext(), event, UploadFileAsInputStreamsMessageProcessor.class.getDeclaredField("_initialCommentType").getGenericType(), null, initialComment));
            final InputStream _transformedInputStream = ((InputStream) evaluateAndTransform(getMuleContext(), event, UploadFileAsInputStreamsMessageProcessor.class.getDeclaredField("_inputStreamType").getGenericType(), null, inputStream));
            Object resultPayload;
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return true;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((SlackConnector) object).uploadFileAsInputStreams(_transformedChannelID, _transformedFileName, _transformedFileType, _transformedTitle, _transformedInitialComment, _transformedInputStream);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(InputStream.class)));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(FileUploadResponse.class)));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(null, false, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at SlackConnector at uploadFileAsInputStreams retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}
